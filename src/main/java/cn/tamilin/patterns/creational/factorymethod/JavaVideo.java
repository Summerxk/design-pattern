package cn.tamilin.patterns.creational.factorymethod;

/**
 * @ClassName JavaVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 15:53
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java视频课程");
    }
}
