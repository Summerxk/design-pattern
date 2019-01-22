package cn.tamilin.design_pattern.compositionaggregation;

import lombok.extern.slf4j.Slf4j;
import sun.security.pkcs11.Secmod;

/**
 * @ClassName ProductConnection
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/22 14:30
 */
@Slf4j
public class ProductDao extends DBConnection {
    public void addProduct() {
        String conn = super.getConnection();
        log.info("使用 {} 增加product", conn );
    }

}
