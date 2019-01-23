package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName JavaCourseFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 11:02
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
