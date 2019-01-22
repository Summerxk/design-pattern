package cn.tamilin.design_pattern.demeter.modify;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/21 20:51
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader  = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
