package com.endava.grocy.entity.product;

import com.endava.grocy.TestBaseClass;
import com.endava.grocy.model.Entity;
import com.endava.grocy.model.Product;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.notNullValue;

public class CreateProductTest extends TestBaseClass {

    @Test

    public void shouldCreateProduct(){
//        GIVEN
        Product product = dataProvider.getProduct();

//        WHEN
        Response response = entityClient.createEntity(Entity.PRODUCTS, product);

//        THEN
        response.then().statusCode(HttpStatus.SC_CREATED)
                .body("created_object_id", notNullValue());

    }
}
