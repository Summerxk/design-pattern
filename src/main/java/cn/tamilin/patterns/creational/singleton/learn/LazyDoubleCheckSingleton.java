package cn.tamilin.patterns.creational.singleton.learn;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 17:37
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton singleton = null;
    // volatile 禁止了重排序 使用了缓存一致性协议 这种方式是禁止重排序 还有一种是 允许重排序 但是线程不可见的方式

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance () {
        if(singleton ==null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    /**
                     * 1.分配内存
                     * 2.初始化这个对象
                     * 3.设置singleton 指向刚分配的内存地址
                     *
                     * 对于2，3顺序可能颠倒 指令重排序 编程 1，3，2
                     */
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
