package cn.tamilin.design_pattern.demeter.modify;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TeamLeader
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 20:42
 */
@Slf4j
public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i<20; i++) {
            courseList.add(new Course());
        }
        log.info("online course size is" + courseList.size());
    }
}
