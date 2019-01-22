package cn.tamilin.patterns.creational.factorymethod;

/**
 * @ClassName FEVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 19:09
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制fe的教学视频");
    }
}
