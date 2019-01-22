package cn.tamilin.design_pattern.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Boss
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 20:41
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i<20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }
}
