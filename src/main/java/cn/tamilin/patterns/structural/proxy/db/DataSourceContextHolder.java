package cn.tamilin.patterns.structural.proxy.db;

/**
 * @ClassName DataSourceContextHolder
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 16:40
 */
public class DataSourceContextHolder {
	private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

	public static void setDBType(String dbType) {
		CONTEXT_HOLDER.set(dbType);
	}

	public static String getDBType() {
		return (String) CONTEXT_HOLDER.get();
	}

	public static void clearDBType() {
		CONTEXT_HOLDER.remove();
	}
}
