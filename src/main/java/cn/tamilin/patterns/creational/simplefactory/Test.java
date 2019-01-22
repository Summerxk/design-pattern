package cn.tamilin.patterns.creational.simplefactory;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 15:55
 */
public class Test {

//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();
//    }

//    public static void main(String[] args) {
//        Video video = new JavaVideo();//如果再用python 需要改这个地方 应用层依赖于类名
//        video.produce();
//    }

    /**
     * 利用反射
     */
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null)
            return;
        video.produce();
    }
}
