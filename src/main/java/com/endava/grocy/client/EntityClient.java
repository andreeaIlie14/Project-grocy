package com.endava.grocy.client;

import com.endava.grocy.filters.LogFilter;
import com.endava.grocy.filters.AuthenticationFilter;
import com.endava.grocy.model.Entity;
import com.endava.grocy.model.Product;
import com.endava.grocy.util.EnvReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class EntityClient {

    public Response createEntity(Entity entity, Product product) {

        return given().filters(new AuthenticationFilter(), new LogFilter())
                .baseUri(EnvReader.getBaseUri())
                .basePath(EnvReader.getBasePath())
                .contentType(ContentType.JSON)
                .body(product)
                .pathParam("entity", entity)
                .post("/objects/{entity}");
    }
}
