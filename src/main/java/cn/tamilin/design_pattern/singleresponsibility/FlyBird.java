package cn.tamilin.design_pattern.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName FlyBird
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 19:36
 */
@Slf4j
public class FlyBird {

    public void mainMoveMode(String name) {
        log.info(name + "用翅膀飞");
    }
}
