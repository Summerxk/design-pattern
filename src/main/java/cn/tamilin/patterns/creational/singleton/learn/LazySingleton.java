package cn.tamilin.patterns.creational.singleton.learn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @ClassName LazySingleton
 * @Desciption 懒汉式 注重的式延时加载  线程不安全啊
 * @Author summer
 * @Date 2019/1/23 17:06
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    private LazySingleton() {
        if (flag) {
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

//    public synchronized static LazySingleton getInstance() {// synchronized 锁静态方法的时候 相当于锁了这个类
//        if(lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

   public synchronized static LazySingleton getInstance() {// synchronized 比较消耗资源
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static void main(String[] args) throws Exception {
//        Class objectClass = LazySingleton.class;
//        Constructor c = objectClass.getDeclaredConstructor();
//        c.setAccessible(true);
//        LazySingleton o1 = LazySingleton.getInstance();
//        LazySingleton o2 = (LazySingleton) c.newInstance();// 不管这两个哪个先生成实例 都是抛出异常的 说明上面这种加信号量的方式好用
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1 == o2);
//    }

    // 反射破坏flag
    public static void main(String[] args) throws Exception{
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);
        LazySingleton o1 = LazySingleton.getInstance();
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);
        LazySingleton o2 = (LazySingleton) c.newInstance();// 不管这两个哪个先生成实例 都是抛出异常的 说明上面这种加信号量的方式好用
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);//false 反射攻击成功
    }
}
