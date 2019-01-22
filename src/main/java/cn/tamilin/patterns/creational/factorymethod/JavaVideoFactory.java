package cn.tamilin.patterns.creational.factorymethod;

/**
 * @ClassName JavaVideoFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 19:05
 */
public class JavaVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
