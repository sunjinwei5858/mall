package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 19:41
 * @description: 订单来源：0->PC订单；1->app订单
 **/
public enum OrderSourceType {
    PC_ORDER(0, "PC订单"),
    APP_ORDER(1, "app订单");
    private int code;
    private String msg;

    OrderSourceType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
