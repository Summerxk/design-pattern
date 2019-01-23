package cn.tamilin.patterns.creational.builder.v2;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 15:00
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("")
                .buildCoursePPT("")
                .buildCourseVideo("")
                .buildCourseQA("")
                .build();
    }
}
