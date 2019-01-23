package cn.tamilin.patterns.creational.singleton.instance.hungry;

/**
 * @ClassName StaticInnerClassSingletion
 * @Desciption 使用静态类的方式 允许重排序 但是对于线程不可见
 *
 * 基于类初始化的延迟加载解决方案
 * @Author summer
 * @Date 2019/1/23 17:52
 */
public class StaticInnerClassSingletion {

    private static class InnerClass {
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
}
