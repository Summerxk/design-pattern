package cn.tamilin.patterns.creational.simplefactory;

/**
 * @ClassName PythonVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 15:54
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python视频课程");
    }
}
