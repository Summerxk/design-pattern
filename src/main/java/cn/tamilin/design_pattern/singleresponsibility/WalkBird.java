package cn.tamilin.design_pattern.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName WalkBird
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 19:37
 */
@Slf4j
public class WalkBird {
    public void mainMoveMode(String name) {
        log.info(name + "脚丫子飞");
    }
}
