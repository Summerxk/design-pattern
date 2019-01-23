package cn.tamilin.patterns.creational.builder;

/**
 * @ClassName CourseBuilder
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 14:11
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);
    public abstract Course makeCourse();
}
