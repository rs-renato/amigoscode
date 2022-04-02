package com.amigos.services.customer.controller;

import com.amigos.services.customer.dto.CustomerRegistrationRequest;
import com.amigos.services.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(
        CustomerService service) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest request){
        log.info("New customer registration {}", request);
        service.registerCustomer(request);
    }
}
