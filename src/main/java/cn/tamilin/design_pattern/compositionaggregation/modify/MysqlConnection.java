package cn.tamilin.design_pattern.compositionaggregation.modify;

import sun.security.pkcs11.Secmod;

/**
 * @ClassName MysqlConnection
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:37
 */
public class MysqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "mysql 数据库链接";
    }
}
