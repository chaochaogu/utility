package com.chaochaogu.azure;

import lombok.Builder;
import lombok.Data;

/**
 * 邮件参数类
 *
 * @author chaochao Gu
 * @date 2020/1/15
 */
@Data
@Builder
public class MailParams {
    /**
     * 发件人
     */
    private String from;
    /**
     * 收件人
     */
    private String to;
    /**
     * 发送内容
     */
    private String content;
    /**
     * 是否是html邮件
     */
    private boolean isHtml;
    /**
     * 发送方用户名
     */
    private String username;
    /**
     * 发送方密码
     */
    private String password;
    /**
     * 邮件服务器地址
     */
    private String serverHost;
    /**
     * 邮件主题
     */
    private String subject;
}
