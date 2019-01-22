package cn.tamilin.design_pattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName FECourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 16:57
 */
@Slf4j
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("summer study FE");
    }
}
