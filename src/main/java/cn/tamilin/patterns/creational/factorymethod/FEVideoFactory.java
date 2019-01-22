package cn.tamilin.patterns.creational.factorymethod;

/**
 * @ClassName FEVideoFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 19:10
 */
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
