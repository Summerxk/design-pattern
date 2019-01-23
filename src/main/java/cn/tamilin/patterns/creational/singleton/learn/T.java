package cn.tamilin.patterns.creational.singleton.learn;

/**
 * @ClassName T
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 17:11
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
