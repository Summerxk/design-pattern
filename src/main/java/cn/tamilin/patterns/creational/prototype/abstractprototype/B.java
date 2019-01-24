package cn.tamilin.patterns.creational.prototype.abstractprototype;

/**
 * @ClassName B
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 11:20
 */
public class B extends A{
    public static void main(String[] args) throws Exception{
        B b = new B();
        b.clone();// 继承A 会调用父类的clone方法
    }
}
