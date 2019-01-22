package cn.tamilin.patterns.creational.simplefactory;

import javax.swing.*;

/**
 * @ClassName VideoFactory
 * @Desciption 可以用枚举
 * 缺点：随着课程的扩展要不停的修改这个类 不符合开闭原则 对扩展开放 对修改关闭
 * @Author summer
 * @Date 2019/1/22 15:57
 */
public class VideoFactory {
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        }else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }

    /**
     * 利用反射
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }
}
