package cn.tamilin.patterns.structural.flyweight;

/**
 * @ClassName Manager
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/28 11:02
 */
public class Manager implements Employee{
	@Override
	public void report() {
		System.out.println(reportContent);
	}

	private String department;
	private String reportContent;


	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public Manager(String department) {
		this.department = department;
	}
}
