package com.zah.entity;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.io.Serializable;

/**
 * 接口层统一返回的数据封装接口
 *
 * @author app
 */
public class Result<E> implements Serializable {
    public final static int CODE_SUCCESS = 200;
    public final static int CODE_ERROR = 201;
    public final static int CODE_VAILD_ERROR = 500;
    public int code = CODE_SUCCESS;
    public String msg;
    public E data;
    @JsonIgnore
    public String sign;//签名,使用于数据安全验证码


    public Result() {
        this.code = CODE_SUCCESS;
        this.msg = "成功";
    }

    public Result(E data) {
        this.code = CODE_SUCCESS;
        this.msg = "成功";
        this.data = data;
    }

    public static Result getResult() {
        return new Result();
    }

    public E getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result<E> error(int code, String errorMsg) {
        this.code = code;
        this.msg = errorMsg;
        return this;
    }

    public Result<E> error(String errorMsg) {
        this.code = CODE_ERROR;
        this.msg = errorMsg;
        return this;
    }

    public Result<E> success(String msg) {
        this.code = CODE_SUCCESS;
        this.msg = msg;
        return this;
    }

    public boolean isSuccess() {
        return code == 200;
    }

    public boolean isError() {
        return !isSuccess();
    }

    /*@Override
    public String toString() {
        return toJSON();
    }

 //   public String toJSON() {
        return JSON.toJSON(this);
    }*/
}
