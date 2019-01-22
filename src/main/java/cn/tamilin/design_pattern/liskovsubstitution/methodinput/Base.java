package cn.tamilin.design_pattern.liskovsubstitution.methodinput;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @ClassName Base
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 13:37
 */
@Slf4j
public class Base {

    public void method(HashMap map) {
        log.info("base method execute");
    }
}
