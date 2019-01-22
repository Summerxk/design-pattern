package cn.tamilin.design_pattern.liskovsubstitution;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 12:43
 */
@Slf4j
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            log.info("width:{}, length:{}", rectangle.getWidth(), rectangle.getLength());
        }
        log.info("resize function end {}, {}", rectangle.getWidth(), rectangle.getLength());
    }

    public static void main(String[] args) {
        Sguare sguare = new Sguare();
        sguare.setLength(10);
        resize(sguare);// 这里会造成无限循环 正方形不能继承长方形
    }
//    }
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }
}
