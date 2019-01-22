package cn.tamilin.design_pattern.liskovsubstitution.methodinput;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Child
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 13:38
 */
@Slf4j
public class Child extends Base{

    @Override
    public void method(HashMap map) {
        log.info("child 重写 hashmap method子类被执行");
    }

    public void method(Map map) {
        log.info("重载method map 方法被执行");
    }
}

