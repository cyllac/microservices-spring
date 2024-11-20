package com.cyllac.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
