package cn.tamilin.design_pattern.openclose;

/**
 * @ClassName JavaCourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 16:17
 */
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
