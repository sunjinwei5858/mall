package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 17:58
 * @description:
 **/
public enum NoteEnum {
    DELIVERY("完成发货"),
    CLOSE("订单关闭"),
    UPDATE_MONEY_INFO("修改费用信息"),
    UPDATE_NOTE_INFO("修改备注信息"),
    UPDATE_RECEIVER_INFO("修改收货人信息");

    private String note;

    NoteEnum(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}
