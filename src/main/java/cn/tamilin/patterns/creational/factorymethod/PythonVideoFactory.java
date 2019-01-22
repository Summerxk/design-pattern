package cn.tamilin.patterns.creational.factorymethod;

/**
 * @ClassName PythonVideoFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 19:06
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
