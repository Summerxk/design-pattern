package cn.tamilin.design_pattern.liskovsubstitution.methodoutput;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @ClassName Child
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:01
 */
@Slf4j
public class Child extends Base{

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        log.info("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
