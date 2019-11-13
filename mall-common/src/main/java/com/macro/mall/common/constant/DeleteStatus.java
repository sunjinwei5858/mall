package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 19:33
 * @description: 删除状态：0->未删除；1->已删除
 **/
public enum DeleteStatus {
    NOT_DELETED(0, "未删除"),
    ALREADY_DELETED(1, "已删除");
    private int code;
    private String msg;

    DeleteStatus(int code, String msg) {
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
