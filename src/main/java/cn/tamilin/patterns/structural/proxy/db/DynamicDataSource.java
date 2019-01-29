package cn.tamilin.patterns.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName DynamicDataSource
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 16:39
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDBType();
	}
}
