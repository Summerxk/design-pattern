package cn.tamilin.patterns.creational.singleton.learn;

/**
 * @ClassName EnumInstance
 * @Desciption
 *
 * ﻿enum 天然的序列化机制 不会造成序列化破坏
 *  用反射的时候
 *      获取不到enum无参构造器 会报错 所以用反射不能进行攻击
 *      如果非要传参数 会报出不能利用反射创建枚举对象
 *  所以不能进行反射攻击
 *
 * @Author summer
 * @Date 2019/1/23 19:34
 */
public enum EnumInstance {
    INSTANCE {
        protected void printTest() {
            System.out.println("summer print test");
        }
    };

    // 方法名称跟 枚举里面的方法名称一样，然后声明这个抽象方法是为了能调用枚举实例内部的方法
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
