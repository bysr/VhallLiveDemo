package com.sdklibs.net.mode;

/**
 * @Description: 封装的通用服务器返回对象，可自行定义
 */
public class ApiResult<T> {
    private int rt;
    private String msg;
    private T data;



    public int getCode() {
        return rt;
    }

    public ApiResult setCode(int rt) {
        this.rt = rt;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ApiResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ApiResult setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "rt=" + rt +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
