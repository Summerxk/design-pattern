package cn.tamilin.design_pattern.dependenceinversion;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 16:44
 */
public class Test {
    public static void main(String[] args) {
        Summer summer = new Summer();
        summer.StudyJavaCourse();
        summer.StudyFECourse();

        /**
         *          新增加学习python方法 这里的方法是面向实现编程 因为summer是一个实现类 我们面向实现编程
         *          会发现这个实现类是经常修改的 扩展性比较差，
         *          Test应用层的修改是依赖于底层实现的 根据依赖倒置原则  高层次是不应该依赖于低层次的实现的
         *          也就是Test调用什么 实现类中就要修改什么
         *
         *          引入抽象解决这个问题
         */
        summer.StudyPythonCourse();

        summer.study(new JavaCourse());
        summer.study(new FECourse());
    }
}
