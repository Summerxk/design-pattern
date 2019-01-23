package cn.tamilin.patterns.creational.singleton.instance.lazy;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Desciption readResolve() 方法解决序列化破坏 懒汉模式不能防止反射攻击
 * @Author summer
 * @Date 2019/1/23 17:37
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance () {
        if(singleton ==null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
