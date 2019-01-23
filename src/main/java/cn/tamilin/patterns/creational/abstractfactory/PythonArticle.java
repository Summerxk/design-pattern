package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName PythonArticle
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 11:06
 */
public class PythonArticle extends Article{

    @Override
    public void produce() {
        System.out.println("编写python手记");
    }
}
