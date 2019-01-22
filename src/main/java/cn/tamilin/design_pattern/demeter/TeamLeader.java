package cn.tamilin.design_pattern.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName TeamLeader
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 20:42
 */
@Slf4j
public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList) {
        log.info("online course size is" + courseList.size());
    }
}
