package cn.tamilin.patterns.creational.factorymethod;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 15:55
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
