package cn.tamilin.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/28 11:04
 */
public class EmployeeFactory {

	private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

	public static Employee getManager(String department) {
		Manager manager = (Manager) EMPLOYEE_MAP.get(department);
		if(manager == null){
			manager = new Manager(department);
			System.out.println("创建部门经理" + department);
			String constant = department + "部门汇报：此次报告的主要内容是。。。。";
			manager.setReportContent(constant);
			System.out.println("创建报告：" + constant);
			EMPLOYEE_MAP.put(department, manager);
		}
		return manager;
	}
}
