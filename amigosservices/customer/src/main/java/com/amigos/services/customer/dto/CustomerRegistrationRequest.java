package com.amigos.services.customer.dto;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email){
}