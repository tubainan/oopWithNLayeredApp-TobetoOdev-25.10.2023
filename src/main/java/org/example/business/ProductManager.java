package org.example.business;

import org.example.core.logging.Logger;
import org.example.dateAccess.JdbcProductDao;
import org.example.dateAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add (Product product) throws Exception {
//iş kuralları
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün Fiyatı 10'dan Küçük Olamaz");
        }
        //JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
        for (Logger logger: loggers) { //[db,file]
            logger.log(product.getName());

        }

    }

}
