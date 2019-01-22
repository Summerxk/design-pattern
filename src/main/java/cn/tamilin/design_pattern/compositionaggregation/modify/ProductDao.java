package cn.tamilin.design_pattern.compositionaggregation.modify;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ProductConnection
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:30
 */
@Slf4j
public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        log.info("使用 {} 增加product", conn );
    }

}
