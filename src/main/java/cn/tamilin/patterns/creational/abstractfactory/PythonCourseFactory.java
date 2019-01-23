package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName PythonCourseFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 11:07
 */
public class PythonCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
