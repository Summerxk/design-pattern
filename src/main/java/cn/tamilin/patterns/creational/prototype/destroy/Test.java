package cn.tamilin.patterns.creational.prototype.destroy;

import java.lang.reflect.Method;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 12:38
 */
public class Test {
    public static void main(String[] args) throws Exception{
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);// clone要进行重写 方式克隆破坏 不实现Cloneable 接口 或者实现了 要重写clone方法

    }
}
