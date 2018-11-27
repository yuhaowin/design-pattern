package com.yuhaowin.design.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {

    public static void sendMail(Mail mail){
        String out = "向{0}同学,邮件地址:{1},邮件内容:{2},发送邮件成功!";
        System.out.println(MessageFormat.format(out,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储OriginMail记录:"+mail.getContent());
    }
}
