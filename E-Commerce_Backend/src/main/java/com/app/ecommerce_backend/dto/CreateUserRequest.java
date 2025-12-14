package com.app.ecommerce_backend.dto;

import com.app.ecommerce_backend.entities.Role;
import lombok.Builder;

@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Role authority
) {
}
