package cn.tamilin.patterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName ArticleApprover
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:58
 */
public class ArticleApprover extends Approver{
	@Override
	public void deploy(Course course) {
		if (StringUtils.isNoneEmpty(course.getArticle())) {
			System.out.println(course.getName() + "含有手记，批准");
			if (approver != null) {
				approver.deploy(course);
			}
		}else {
			System.out.println(course.getName() + "不含有手记，不批准");
			return;
		}
	}
}
