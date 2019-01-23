package cn.tamilin.patterns.creational.singleton.learn;

/**
 * @ClassName StaticInnerClassSingletion
 * @Desciption 使用静态类的方式 允许重排序 但是对于线程不可见
 *
 * 基于类初始化的延迟加载解决方案
 * @Author summer
 * @Date 2019/1/23 17:52
 */
public class StaticInnerClassSingletion {

    private static class InnerClass {// 这里有一个class对象的初始化锁 看哪个线程先拿到 哪个线程就先初始化
        private static StaticInnerClassSingletion staticInnerClassSingletion = new StaticInnerClassSingletion();
    }

    public static StaticInnerClassSingletion getInstance() {
        return InnerClass.staticInnerClassSingletion;
    }

    private StaticInnerClassSingletion () {
        if(InnerClass.staticInnerClassSingletion != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * java语言规范中中 一个类会被立刻初始化的几种情况
     * 假设有一个A类
     * 1.A类型的实例被创建
     * 2.A类中的一个静态方法被调用
     * 3.A类中的一个静态成员被赋值
     * 4.A类中的一个静态成员被使用，并且这个成员不是一个常量成员
     * 5.A类如果有顶级类，如果类中有断言语句 就会被初始化
     */

    /**
     * 静态初始化和懒汉式都是为了延迟初始化 为了降低开销
     */
}
