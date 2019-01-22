package cn.tamilin.design_pattern.liskovsubstitution.modify;

/**
 * @ClassName Sguare
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 12:41
 */
public class Sguare implements Quadrangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
