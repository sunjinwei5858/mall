package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 19:19
 * @description: 支付方式：0->未支付；1->支付宝；2->微信
 **/
public enum PayType {
    NOT_PAY(0, "未支付"),
    ALI_PAY(1, "支付宝"),
    WE_CHAT(2, "微信");

    private int code;
    private String msg;

    PayType(int code, String msg) {
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
