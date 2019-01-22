package cn.tamilin.design_pattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Summer
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 16:42
 */
@Slf4j
public class Summer {

    public void StudyJavaCourse() {
        log.info("summer study java course");
    }

    public void StudyFECourse() {
        log.info("summer study FE course");
    }

    public void StudyPythonCourse() {
        log.info("summer study python course");
    }

    /**
     * 传递一个接口的实现进来
     * @param iCourse
     */
    public void study(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
