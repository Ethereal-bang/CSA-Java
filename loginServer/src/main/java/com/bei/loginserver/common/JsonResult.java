package com.bei.loginserver.common;

public class JsonResult<T> {

    private boolean flag;   // 请求成功与否
    private String message; // 请求提示
    private T data; // 提示信息/数据

    // 请求失败
    public JsonResult(String message) {
        this.flag = false;
        this.message = message;
    }

    // 请求成功
    public JsonResult(boolean flag, T data) {
        this.flag = true;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
