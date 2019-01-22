package cn.tamilin.design_pattern.interfacesegregation;

/**
 * @ClassName IAnimalAction
 * @Desciption 在接口中定义了 吃饭 飞 游泳 但是 狗不会飞 鸟有的不会游泳 所以要进行接口隔离 不同动物实现不同接口
 * @Author summer
 * @Date 2019/1/21 20:22
 */
public interface IAnimalAction {
    void eat();
    void fly();
    void swim();
}
