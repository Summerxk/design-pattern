package cn.tamilin.patterns.creational.singleton.instance.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @ClassName LazySingleton
 * @Desciption readResolve() 方法解决序列化破坏 懒汉模式不能防止反射攻击 这种写法是不高效的 不用
 * @Author summer
 * @Date 2019/1/23 17:06
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }


   public synchronized static LazySingleton getInstance() {// synchronized 比较消耗资源
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
