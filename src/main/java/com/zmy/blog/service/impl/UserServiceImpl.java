package com.zmy.blog.service.impl;

import com.zmy.blog.dao.RoleInfoDao;
import com.zmy.blog.dao.TokenDao;
import com.zmy.blog.dao.UserInfoDao;
import com.zmy.blog.entity.UserInfo;
import com.zmy.blog.entity.enumEntity.Msg;
import com.zmy.blog.entity.enumEntity.RoleCode;
import com.zmy.blog.service.TokenService;
import com.zmy.blog.service.UserService;
import com.zmy.blog.util.PasswordUtil;
import com.zmy.blog.util.ValidatorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author: zmy
 * @date: 2019/1/14 23:41
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private RoleInfoDao roleInfoDao;

    @Autowired
    private TokenService tokenService;

    /**
     * 登录
     *
     * @param userInfo
     */
    @Override
    public Map<String, Object> loginUser(UserInfo userInfo) {
        Map<String, Object> result = new HashMap<>();
        result.put("result", true);

        if(ValidatorUtil.isEmpty(userInfo.getUserName())){
            result.put("result", false);
            result.put("msg", "用户名不可以为空");
            return result;
        }
        if(ValidatorUtil.isEmpty(userInfo.getPassword())){
            result.put("result", false);
            result.put("msg", "密码不可以为空");
            return result;
        }
        if(!isUserNameExist(userInfo.getUserName())){
            result.put("result", false);
            result.put("msg", "用户名不存在");
            return result;
        }

        UserInfo user = userInfoDao.getUserInfoByUserName(userInfo.getUserName());

        if(!user.getPassword().equals(PasswordUtil.getMD5(userInfo.getPassword() + user.getSalt()))){
            result.put("result", false);
            result.put("msg", "密码错误");
            return result;
        }else {
            //登录成功
            result.put("msg", Msg.login_success.getValue());
            //加token
            result.put("token", tokenService.addLoginToken(user.getId()).getToken());
        }
        return result;
    }

    /**
     * 注册
     *
     * @param userInfo
     */
    @Override
    public Map<String, Object> registerUser(UserInfo userInfo) {
        Map<String, Object> result = registerValidator(userInfo);

        if((boolean) result.get("result")){
            //初始化
            userInfo.setId(UUID.randomUUID().toString());
            userInfo.setCreateTime(new Date());
            userInfo.setIsDel(false);
            userInfo.setNickName(userInfo.getUserName());
            userInfo.setSalt(userInfo.getId().replaceAll("-","").substring(0,5));
            //密码存密文
            userInfo.setPassword(PasswordUtil.getMD5(userInfo.getPassword() + userInfo.getSalt()));
            //默认为普通用户
            if(ValidatorUtil.isEmpty(userInfo.getRoleId())){
                userInfo.setRoleId(roleInfoDao.getRoleInfoByRoleCode(RoleCode.normal.toString()).getId());
            }

            if(userInfoDao.addUserInfo(userInfo) != 1){
                result.put("result", false);
            }
        }
        return result;
    }

    /**
     * 查询
     *
     * @param id
     */
    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoDao.getUserInfoById(id);
    }

    /**
     * 注册验证
     *
     * @param userInfo
     */
    @Override
    public Map<String, Object> registerValidator(UserInfo userInfo) {
        Map<String, Object> result = new HashMap<>();
        result.put("result", true);

        String userName = userInfo.getUserName();
        String password = userInfo.getPassword();
        String nickName = userInfo.getNickName();

        //非空验证
        if(ValidatorUtil.isEmpty(userName)){
            result.put("result", false);
            result.put("msg", "用户名不可以为空");
            return result;
        }
        if(ValidatorUtil.isEmpty(password)){
            result.put("result", false);
            result.put("msg", "密码不可以为空");
            return result;
        }

        //长度验证
        if(!ValidatorUtil.isLengthValid(userName, 4, 20)){
            result.put("result", false);
            result.put("msg", "用户名必须为4-20位");
            return result;
        }
        if(!ValidatorUtil.isLengthValid(password, 6, 20)){
            result.put("result", false);
            result.put("msg", "密码必须为6-20位");
            return result;
        }
        if(!ValidatorUtil.isLengthValid(nickName, 1, 20)){
            result.put("result", false);
            result.put("msg", "昵称必须为1-20位");
            return result;
        }

        return result;
    }

    /**
     * 用户名是否存在
     *
     * @param userName
     */
    @Override
    public boolean isUserNameExist(String userName) {
        return userInfoDao.getUserInfoByUserName(userName) != null;
    }
}
