package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 19:38
 * @description: 订单类型：0->正常订单；1->秒杀订单
 **/
public enum OrderType {

    NORMAL(0, "正常订单"),
    SECONDS_KILL(1, "秒杀订单");

    private int code;
    private String type;

    OrderType(int code, String type) {
        this.code = code;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

}
