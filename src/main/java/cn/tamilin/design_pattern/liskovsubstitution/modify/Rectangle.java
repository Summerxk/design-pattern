package cn.tamilin.design_pattern.liskovsubstitution.modify;

/**
 * @ClassName Rectangle
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 12:40
 */

public class Rectangle implements Quadrangle{
    private long length;
    private long width;

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
