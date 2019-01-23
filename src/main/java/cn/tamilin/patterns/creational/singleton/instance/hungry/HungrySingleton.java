package cn.tamilin.patterns.creational.singleton.instance.hungry;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Desciption 如果需要序列化 要写一个 readResolve() 防止序列化破坏单例
 * @Author summer
 * @Date 2019/1/23 18:06
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private  HungrySingleton () {
        if(hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
