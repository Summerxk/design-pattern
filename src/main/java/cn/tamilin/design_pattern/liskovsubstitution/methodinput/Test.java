package cn.tamilin.design_pattern.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 13:40
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
        // 这里如果注释调chile重写父类的hashmap方法 那么依旧是父类被执行因为父类中是hashmap 子类中是map
        //如果 父类中是map 子类中是hashmap 子类会被执行 这样会引起业务逻辑的混乱 所以 根据里氏替换原则 子类的入参 要比父类的入餐更加宽松 也就是
        // 父类是hashmap 子类应该是map 当相同的时候就是重写了 会执行子类
    }
}
