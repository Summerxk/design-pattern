package cn.tamilin.patterns.creational.prototype.abstractprototype;

/**
 * @ClassName A
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 11:19
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
