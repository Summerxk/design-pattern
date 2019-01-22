package cn.tamilin.design_pattern.openclose;

/**
 * @ClassName JavaDiscountCourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 16:25
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    // 当 ICourse icourse = new JavaDiscountCourse()的时候 icourse获取不到这个 方法 应该向下强转一下才行
    // 通过重新定义一个实现类避免了接口的改动 以及 原有子类的变动 只需要更改调用层的代码 就可以实现业务的实现
    //越底层的变化 影响的范围越大，越高层的变化 影响的越小
    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
