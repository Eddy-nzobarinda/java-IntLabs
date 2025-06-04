package com.eddy.microservices.product_service.dto;


import java.math.BigDecimal;

public record ProductRequest(String Id, String name, String description, BigDecimal price) {
}
