package com.eddy.microservice.inventory_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.eddy.microservice.inventory_service.repository.InventoryRepository;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThan(skuCode, quantity);
    }
}