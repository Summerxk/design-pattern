package cn.tamilin.patterns.creational.singleton.instance.threadlocal;

/**
 * @ClassName ThreadLocalInstance
 * @Desciption ﻿不能保证全局唯一 但是会保证线程单例
 * @Author summer
 * @Date 2019/1/23 20:13
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> instance = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return super.initialValue();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return instance.get();
    }
}
