package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 19:43
 * @description: 发票类型：0->不开发票；1->电子发票；2->纸质发票
 **/
public enum BillType {
    NOT_ISSUE_INVOICE(0, "不开发票"),
    E_INVOICE(1, "电子发票"),
    PAPER_INVOICE(2, "纸质发票");

    private int code;
    private String msg;

    BillType(int code, String msg) {
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
