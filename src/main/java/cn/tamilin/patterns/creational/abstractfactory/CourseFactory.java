package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName CourseFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 10:59
 */
public interface CourseFactory {

    Video getVideo();
    Article getArticle();
}
