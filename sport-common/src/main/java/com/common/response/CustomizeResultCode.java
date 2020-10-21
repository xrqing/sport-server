package com.common.response;

/**
 * @Description: 定义状态码
 * @auther: xrq
 * @date: 2020/10/21 12:02
 */
public interface CustomizeResultCode {

    /**
     * 获取错误状态码
     */
    Integer getCode();

    /**
     * 获取错误信息
     */
    String getMessage();
}
