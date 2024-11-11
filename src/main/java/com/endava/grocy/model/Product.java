package com.endava.grocy.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    @EqualsAndHashCode.Exclude
    private Integer id;
    private String name;
    private String description;
    @JsonProperty("location_id")
    private Integer locationId;
    @JsonProperty("min_stock_amount")
    private Integer minStockAmount;
    @JsonProperty("qu_id_stock")
    private Integer quantityStockId;
    @JsonProperty("qu_id_pruchase")
    private Integer quantityPurchaseId;


    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return super.toString();
        }
    }
}
