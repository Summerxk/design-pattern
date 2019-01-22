package cn.tamilin.design_pattern.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Bird
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 19:29
 */
@Slf4j
public class Bird {
    public void mainMoveMode(String name) {
        if(name.equals("summer")) {
            log.info(name + "用翅膀飞");
        }else {
            log.info(name + "用脚丫子走");
        }// 如果再加如别的名称 就要不停的修改这里的代码 这样的维护成本比较大 然后风险也增大
    }
}
