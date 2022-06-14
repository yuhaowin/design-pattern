package com.yuhaowin.design.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        mail.setContent("初始化模板....");

//        for (int i = 0; i < 5; i++) {
////            mail.setName("abc"+i);
////            mail.setEmailAddress("abc"+i+"@yuhaowin.com");
////            mail.setContent("恭喜您,本次活动中奖了.");
////            MailUtil.sendMail(mail);
////        }

        for (int i = 0; i < 5; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("abc" + i);
            mailTemp.setEmailAddress("abc" + i + "@yuhaowin.com");
            mailTemp.setContent("恭喜您,本次活动中奖了.");
            MailUtil.sendMail(mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
