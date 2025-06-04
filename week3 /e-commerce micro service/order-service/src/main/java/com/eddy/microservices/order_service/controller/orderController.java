package com.eddy.microservices.order_service.controller;
import com.eddy.microservices.order_service.service.OrderService;
import com.eddy.microservices.order_service.dto.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class orderController {
        private final OrderService orderService;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public String placeOrder(@RequestBody OrderRequest orderRequest) {
            orderService.placeOrder(orderRequest);
            return "order placed successfully";
        }

}
