package com.endava.grocy.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public abstract class Entity {
    @EqualsAndHashCode.Exclude
    private Integer id;
    private String name;
    private String description;

    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();  //converteste din obiect in json
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return super.toString();
        }
    }

}
