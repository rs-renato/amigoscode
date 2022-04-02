package com.amigos.services.customer.service;

import com.amigos.services.customer.dto.CustomerRegistrationRequest;
import com.amigos.services.customer.model.Customer;
import com.amigos.services.customer.reposity.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(
        CustomerRepository repository){

    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        repository.save(customer);
    }
}
