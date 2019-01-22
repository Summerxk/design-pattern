package cn.tamilin.design_pattern.compositionaggregation;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName DBConnection
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:28
 */
@Slf4j
public class DBConnection {

    public String getConnection() {
        return "mysql数据库链接";
    }


}
