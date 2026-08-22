package com.example.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务响应码
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    SUCCESS(200, "ok"),

    // 通用
    UNAUTHORIZED(401, "未登录"),
    FORBIDDEN(403, "无权限"),
    SERVER_ERROR(500, "服务器内部错误"),

    // 用户/积分 1xxx
    USER_NOT_FOUND(1000, "用户不存在"),
    USERNAME_EXISTS(1002, "用户名已存在"),
    USERNAME_OR_PASSWORD_ERROR(1003, "用户名或密码错误"),
    POINTS_NOT_ENOUGH(1001, "积分不足"),
    ACCOUNT_DISABLED(1004, "账号已禁用"),

    // 订单/座位 2xxx
    SEAT_OCCUPIED(2001, "座位已被占"),
    SCHEDULE_SOLD_OUT(2002, "场次已售罄"),
    CINEMA_NOT_AUDITED(2003, "影院未审核通过"),
    ORDER_NOT_FOUND(2004, "订单不存在"),
    ORDER_STATUS_ERROR(2005, "订单状态异常"),
    ORDER_TIMEOUT(2006, "订单已超时"),

    // 权限 3xxx
    CROSS_CINEMA_ACCESS(3001, "越权访问他影院数据"),
    ;

    private final int code;
    private final String message;
}
