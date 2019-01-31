package cn.tamilin.patterns.behavioral.mediator;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:31
 */
public class Test {
	public static void main(String[] args) {
		User summer = new User("summer");
		User yvonne = new User("Yvonne");

		summer.sendMessage("hi yvommer, i love you!");
		yvonne.sendMessage("I know, but i pretend i don't know.");
	}
}
