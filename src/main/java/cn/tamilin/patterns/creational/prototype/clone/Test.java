package cn.tamilin.patterns.creational.prototype.clone;

import java.util.Date;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 11:26
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig)pig1.clone();// clone 是不同的对象 地址是不一样的 因为没有重写hashCode
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666L);
        System.out.println(pig1);
        System.out.println(pig2);

        /**
         *  这里的预期是只修改pig1的生日 ，但是输出的结果 pig2的生日也变了
         *      这是因为在pig1 和 pig2 中引用的是同一个Date对象的地址 所以pig1设置了Date之后
         *      因为两个pig对象指向了同一个Date地址，所以pig2的Date也变了，这是浅clone
         *
         *  深clone 重写clone()   方法 将Data对象也进行clone
         *      @Override
         *     protected Object clone() throws CloneNotSupportedException {
         *         Pig pig = (Pig) super.clone();
         *         //深clone
         *         pig.birthday = (Date) pig.birthday.clone();
         *         return pig;
         *     }
         */
    }
}
