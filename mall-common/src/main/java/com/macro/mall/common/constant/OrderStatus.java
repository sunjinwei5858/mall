package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 18:14
 * @description: 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
 **/
public enum OrderStatus {
    WAIT_PAY(0, "待付款"),
    WAIT_DELIVERY(1, "待发货"),
    ALREADY_DELIVERY(2, "已发货"),
    FINISHED(3, "已完成"),
    CLOSED(4, "已关闭"),
    INVALID_ORDER(5, "无效订单");

    private int code;
    private String msg;

    OrderStatus(int code, String msg) {
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
