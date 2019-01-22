package cn.tamilin.design_pattern.singleresponsibility;

/**
 * @ClassName CourseImpl
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 19:51
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public byte[] courseVideo() {
        return new byte[0];
    }

    @Override
    public String courseName() {
        return null;
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
