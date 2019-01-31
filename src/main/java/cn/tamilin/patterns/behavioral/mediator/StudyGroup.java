package cn.tamilin.patterns.behavioral.mediator;

import java.util.Date;

/**
 * @ClassName StudyGroup
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:31
 */
public class StudyGroup {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" +  user.getName() + "--->" + message + "]");
	}
}
