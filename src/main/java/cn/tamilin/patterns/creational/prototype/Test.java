package cn.tamilin.patterns.creational.prototype;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 11:04
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        System.out.println("初始化mial：" + mail);
        for(int i = 0; i < 10; i++) {
            Mail mailtemp = (Mail)mail.clone();// clone 没有调用Mail的构造器 clone出来的是不同的对象 对象地址不一样
            mailtemp.setName("姓名" + i);
            mailtemp.setEmailAddress("姓名" + i + "@tamilin.cn");
            mailtemp.setContent("恭喜中奖");
            System.out.println("clone mail" + mail);
            MailUtil.sendMail(mailtemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
