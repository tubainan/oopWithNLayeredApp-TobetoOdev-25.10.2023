package org.example.dateAccess;

import org.example.entities.Product;
public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır....SQL
        System.out.println("JDBC ile Veritabanına Eklendi");
    }

}
