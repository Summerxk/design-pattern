package cn.tamilin.patterns.creational.prototype.clone;

import java.util.Date;

/**
 * @ClassName Pig
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 11:22
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深clone
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

//    浅clone
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
