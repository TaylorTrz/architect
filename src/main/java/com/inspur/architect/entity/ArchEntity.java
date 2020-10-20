package com.inspur.architect.entity;

/**
 * 构造返回体
 */
public class ArchEntity<T> {
    private int code;

    private String message;

    private T body;


    public ArchEntity(int code, String message, T body) {
        this.code = code;
        this.message = message;
        this.body = body;
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

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
