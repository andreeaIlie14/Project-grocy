package com.endava.grocy.data;

import com.endava.grocy.model.Location;
import com.endava.grocy.model.Product;
import com.endava.grocy.model.QuantityUnit;
import com.github.javafaker.Faker;

public class DataProvider {

    private Faker faker = new Faker();

    public Product getProduct(Integer locationId, Integer quantityPurchaseId, Integer quantityStockId) {
        Product product = new Product();
        product.setName(faker.commerce().productName());
        product.setDescription(faker.chuckNorris().fact());
        product.setLocationId(locationId);
        product.setMinStockAmount(faker.number().numberBetween(0, 10));
        product.setQuantityPurchaseId(quantityPurchaseId);
        product.setQuantityStockId(quantityStockId);

        return product;
    }

    public Location getLocation() {
        Location location = new Location(); // facem o instantiere pentru Location
        location.setName(faker.relationships().any() + " " + faker.name().fullName());
        location.setDescription(faker.gameOfThrones().quote());
        location.setIsFreezer(faker.options().option(0, 1));

        return location;
    }

    public QuantityUnit getQuantityUnit() {
        QuantityUnit quantityUnit = new QuantityUnit();
        quantityUnit.setName(faker.food().measurement() + " " + faker.number().digits(5));
        quantityUnit.setNamePlural(quantityUnit.getName() + "s");
        quantityUnit.setDescription((faker.backToTheFuture().quote()));

        return quantityUnit;
    }
}
