package cn.tamilin.design_pattern.compositionaggregation.modify;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName DBConnection
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:28
 */
@Slf4j
public abstract  class DBConnection {

    public abstract String getConnection();
}