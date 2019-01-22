package cn.tamilin.design_pattern.compositionaggregation.modify;

/**
 * @ClassName MysqlConnection
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:37
 */
public class SqlServerConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "sqlserver 数据库链接";
    }
}
