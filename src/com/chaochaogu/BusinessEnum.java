package com.yysports.activity.htc.common;

public enum BusinessEnum {

    /**
     * 请求参数错误
     */
    REQUEST_PARAM_ERROR(-1,"请求参数错误"),
    /**
     * 请求成功
     */
    OK(200,"成功"),
    /**
     * 系统错误
     */
    ERR(9999,"系统错误"),

    GROUP_FULL(777,"队伍人数已满"),

    INVITE_CODE_ERROR(1001,"邀请码错误"),

    INVITE_CODE_OCCUPIED(1002,"邀请码已被使用，无法创建队伍"),

    INVITE_CODE_GROUPNAME_ERROR(1003,"邀请码对应队伍名有误"),

    YYMEMBERID_DUPLICATE_OR_GROUPNAME_ERROR(1004,"YY会员编号重复或队伍名称有误"),

    GET_USERINFO_ERROR(1005,"获取用户信息异常"),

    GENERATE_INVITE_CODE_ERROR(1006,"创建邀请码错误"),

    GROUP_MEMBER_NOT_EXIST(1007,"队员不存在"),

    GROUP_NOT_EXIST(1008,"队伍不存在");

    private final int code;

    private final String msg;

    BusinessEnum(int code, String msg){
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

