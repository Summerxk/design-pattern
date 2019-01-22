package cn.tamilin.design_pattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName JavaCourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 16:56
 */
@Slf4j
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("summer study java");
    }
}
