package com.zmy.blog.entity.model;

/**
 * @author: zmy
 * @date: 2019/1/17 0:22
 * @function: 统一相应体
 */

public class Response {
    /**
     * 请求结果
     */
    private Boolean result;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    /**
     * 数据条数
     */
    private Integer total;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Response(Boolean result, String msg){
        this.result = result;
        this.msg = msg;
    }

    public Response(Boolean result, String msg, Object data){
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public Response(Boolean result, String msg, Object data, Integer total){
        this.result = result;
        this.msg = msg;
        this.data = data;
        this.total = total;
    }
}
