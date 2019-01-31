package cn.tamilin.patterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName VideoApprover
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:01
 */
public class VideoApprover extends Approver {
	@Override
	public void deploy(Course course) {
		if (StringUtils.isNoneEmpty(course.getVideo())) {
			System.out.println(course.getName() + "含有视频，批准");
			if (approver != null) {
				approver.deploy(course);
			}
		} else {
			System.out.println(course.getName() + "不含有视频，不批准");
			return;

		}
	}
}