package com.endava.grocy.data;

import com.endava.grocy.model.Product;
import com.github.javafaker.Faker;

public class DataProvider {

    private Faker faker = new Faker();

    public Product getProduct(){
        Product product = new Product();
        product.setName(faker.commerce().productName());
        product.setDescription(faker.chuckNorris().fact());
        product.setLocationId(2);
        product.setMinStockAmount(faker.number().numberBetween(0,10));
        product.setQuantityPurchaseId(5);
        product.setQuantityStockId(5);

        return product;
    }
}
