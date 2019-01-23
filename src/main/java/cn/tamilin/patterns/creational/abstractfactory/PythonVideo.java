package cn.tamilin.patterns.creational.abstractfactory;

/**
 * @ClassName PythonVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/23 11:05
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制python视频");
    }
}
