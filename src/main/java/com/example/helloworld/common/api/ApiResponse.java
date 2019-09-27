package com.example.helloworld.common.api;
import java.io.Serializable;


public class ApiResponse<T> implements Serializable {
    private static final long serialVersionUID = 8708569195046968610L;

    private String msg;
    private int code;
    private T data;

    public static ApiResponse success(){
        return success(ApiBaseResultCode.SUCCESS.msg());
    }

    public static ApiResponse success(String msg){
        ApiResponse resResult = new ApiResponse();
        resResult.setCode(ApiBaseResultCode.SUCCESS.code());
        resResult.setMsg(msg);
        return resResult;
    }

    public static ApiResponse failure(String msg){
        return failure(ApiBaseResultCode.FAILURE.code(),msg);
    }

    public static ApiResponse failure(int code,String msg){
        ApiResponse resResult = new ApiResponse();
        resResult.setCode(code);
        resResult.setMsg(msg);
        return resResult;
    }
    public static <T> ApiResponse successWithData(T data){
        ApiResponse resResult = new ApiResponse();
        resResult.setCode(ApiBaseResultCode.SUCCESS.code());
        resResult.setMsg(ApiBaseResultCode.SUCCESS.msg());
        resResult.setData(data);
        return resResult;
    }

    public static ApiResponse error(String msg){
        return failure(ApiBaseResultCode.FAILURE.code(),msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
