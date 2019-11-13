package com.macro.mall.common.constant;

/**
 * @program: com.macro.mall.common.constant
 * @author: sun jinwei
 * @create: 2019-11-13 19:12
 * @description: 操作人：用户；系统；后台管理员
 **/
public enum OperateMan {
    USER("用户"),
    BACK_MANAGER("后台管理员");
    private String role;

    OperateMan(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
