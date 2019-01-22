package cn.tamilin.design_pattern.liskovsubstitution.methodoutput;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:03
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        log.info("" + child.method());// 在子类的返回值比父类更严格或者相等的时候 正常返回信息
        //如果将子类的返回值 改为Object的时候 ide会进行报错 ide会自动检测
    }
}
