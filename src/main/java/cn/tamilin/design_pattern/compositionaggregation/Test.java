package cn.tamilin.design_pattern.compositionaggregation;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:34
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.addProduct();// 如果再引入其他的数据库链接 就会违反开闭原则
    }
}
