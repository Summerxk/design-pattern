package cn.tamilin.design_pattern.singleresponsibility;

/**
 * @ClassName ICourse
 * @Desciption 在这里 接口中将内容和管理放在了一起 建议将这两项进行分割
 * @Author summer
 * @Date 2019/1/21 19:48
 */
public interface ICourse {
    byte[] courseVideo();
    String courseName();

    void studyCourse();
    void refundCourse();
}
