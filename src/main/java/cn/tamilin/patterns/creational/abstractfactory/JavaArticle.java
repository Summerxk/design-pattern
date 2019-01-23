package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName JavaArticle
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 11:04
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写java课程手记");
    }
}
