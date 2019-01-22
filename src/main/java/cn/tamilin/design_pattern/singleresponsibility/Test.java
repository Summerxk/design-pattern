package cn.tamilin.design_pattern.singleresponsibility;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 19:30
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("summer");
//        bird.mainMoveMode("xiao ou");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("summer");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("xiao ou");
    }
}
