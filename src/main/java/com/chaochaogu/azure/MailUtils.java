package com.chaochaogu.azure;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

/**
 * 邮件工具类
 *
 * @author chaochao Gu
 * @date 2019/9/10
 */
public class MailUtils {

    public static int sendMail(MailParams mailParams) throws Exception {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        // javaMailSender.setHost("smtp.163.com");
        // javaMailSender.setHost("mail.pousheng.com");
        javaMailSender.setHost(mailParams.getServerHost());
        javaMailSender.setUsername(mailParams.getUsername());
        javaMailSender.setPassword(mailParams.getPassword());
        //创建message
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
        //发件人
        helper.setFrom(mailParams.getFrom());
        //收件人
        helper.setTo(mailParams.getTo());
        //邮件标题
        helper.setSubject(mailParams.getSubject());
        //true指的是html邮件
        helper.setText(mailParams.getContent(), mailParams.isHtml());
        //发送邮件
        javaMailSender.send(message);
        return 1;
    }
}
