package com.example.ribbontest.pojo;

/**
 * @description:
 **/

public class Result<T> {
    private T data;
    private int code;
    private String message;

    public Result() {
        this.code = 200;
        this.message = "操作成功";
    }

    public Result(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(T data) {
        this.data = data;
        this.code = 200;
        this.message = "操作成功";
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
