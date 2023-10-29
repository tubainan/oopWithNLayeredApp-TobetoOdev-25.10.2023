package org.example;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dateAccess.HibernateProductDao;
import org.example.business.ProductManager;
import org.example.dateAccess.JdbcProductDao;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone XR", 10000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}