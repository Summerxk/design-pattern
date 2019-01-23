package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName JavaVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 11:03
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
