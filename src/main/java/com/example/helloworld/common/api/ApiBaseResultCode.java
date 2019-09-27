package com.example.helloworld.common.api;

public enum ApiBaseResultCode {
    /**
     * SUCCESS
     */
    SUCCESS(200,"SUCCESS"),
    /**
     * token 认证失败
     */
    TOKENINVAILD(1001,"token 认证失败"),
    /**
     * 权限不够
     */
    NOTPERMISSION(1002,"权限不够"),
    /**
     * 系统异常，请联系管理员
     */
    FAILURE(3000,"系统异常，请联系管理员"),
    /**
     * 参数校验失败
     */
    PARAMSFAILED(3001,"参数校验失败"),
    /**
     * 账号已禁用
     */
    NOTACTIVE(3003,"账号已禁用"),
    /**
     * 业务处理失败
     */
    BUSINESSERROR(4001,"业务处理失败");

    private int code;

    private String msg;

    public int code(){
        return this.code;
    }

    public String msg(){
        return this.msg;
    }

    ApiBaseResultCode(int code,String msg){
        this.code  = code;
        this.msg = msg;
    }
}
