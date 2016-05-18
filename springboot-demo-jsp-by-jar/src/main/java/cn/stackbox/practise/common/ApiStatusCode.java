/**
 * Project Name:demo
 * Package Name:com.example.common
 * Date: 2016-05-18 14:18
 * Copyright (c) 2015,  www.miaozhen All Rights Reserved.
 */
package cn.stackbox.practise.common;

/**
 * ClassName: ApiStatusCode <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-05-18 14:18
 *
 * @author SRK.Lyu (lvsijia@miaozhen.com)
 */


public class ApiStatusCode {

    private Integer statusCode;
    private String description;

    public ApiStatusCode(Integer statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Status 200, 正确API返回状态
     */
    public static ApiStatusCode STATUS_200_OK = new ApiStatusCode(200, null);


    /**
     * Status 1000, 未定义异常
     */
    public static ApiStatusCode STATUS_1000_UNDEFINED_EXCEPTION = new ApiStatusCode(1000, "undefined exception");


}