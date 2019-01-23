package cn.tamilin.patterns.creational.singleton.learn;

import java.lang.reflect.Constructor;

/**
 * @ClassName Test
 * @Desciption
 * @Author summer
 * @Date 2019/1/23 17:07
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println("program end");
//
//        Thread thread1 = new Thread(new T());
//        Thread thread2= new Thread(new T());
//        thread1.start();
//        thread2.start();
//        System.out.println("program end");


          //序列化破坏单例
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single_file"));
//        oos.writeObject(instance);
//
//        File file = new File("single_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();//﻿//点击去 看下就能看到是通过反射创建一个另一个对象
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance = newInstance);//false


        //测试反射攻击
        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance = newInstance);//false 通过反射生成了另一个实例
    }
}
