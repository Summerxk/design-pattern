package cn.tamilin.design_pattern.liskovsubstitution;

/**
 * @ClassName Sguare
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 12:41
 */
public class Sguare extends Rectangle{
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}
