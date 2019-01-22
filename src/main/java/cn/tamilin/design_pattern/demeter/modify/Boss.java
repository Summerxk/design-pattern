package cn.tamilin.design_pattern.demeter.modify;

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
        teamLeader.checkNumberOfCourses();
    }
}
