package cn.tamilin.patterns.creational.singleton.learn;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Desciption TODO
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

    /**
     * java.io.ObjectStreamClass.hasReadObjectMethod
     */
    private Object readResolve() {
        return hungrySingleton;// 解决序列化 反序列后单例的破坏
    }
}
