package com.endava.grocy.stock;

import com.endava.grocy.TestBaseClass;
import com.endava.grocy.model.EntityType;
import com.endava.grocy.model.Stock;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

public class AddStockTest extends TestBaseClass {

    @Test
    public void shouldAddStock() throws IllegalAccessException {
//        GIVEN
        grocyFixture.createEntity(EntityType.LOCATION)
                .createEntity(EntityType.QUANTITY_UNIT)
                .createEntity(EntityType.PRODUCT);
        Integer productId = grocyFixture.getProduct().getId();
        Stock stock = dataProvider.getStock();

//        WHEN
        Response response = stockClient.addStock(productId, stock);

//        THEN
        response.then().statusCode(HttpStatus.SC_OK);

    }
}
