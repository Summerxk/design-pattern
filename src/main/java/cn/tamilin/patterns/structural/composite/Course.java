package cn.tamilin.patterns.structural.composite;

/**
 * @ClassName Course
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/28 14:41
 */
public class Course extends CatalogComponent{
	private String name;
	private double price;

	public Course(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName(CatalogComponent catalogComponent) {
		return this.name;
	}

	@Override
	public Double getPrice(CatalogComponent catalogComponent) {
		return this.price;
	}

	@Override
	public void print() {
		System.out.println("Course name :" + name + "  Course price: " + price);
	}
}
