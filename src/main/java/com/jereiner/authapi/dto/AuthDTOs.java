package com.jereiner.authapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// ── Register ──────────────────────────────────────────────────────────────────

public class AuthDTOs {

    public record RegisterRequest(
            @NotBlank(message = "Name is required")
            String name,

            @NotBlank(message = "Email is required")
            @Email(message = "Invalid email format")
            String email,

            @NotBlank(message = "Password is required")
            @Size(min = 6, message = "Password must be at least 6 characters")
            String password
    ) {}

    public record LoginRequest(
            @NotBlank(message = "Email is required")
            @Email(message = "Invalid email format")
            String email,

            @NotBlank(message = "Password is required")
            String password
    ) {}

    public record AuthResponse(
            String token,
            String type,
            String email,
            String role
    ) {
        public static AuthResponse of(String token, String email, String role) {
            return new AuthResponse(token, "Bearer", email, role);
        }
    }

    public record UserResponse(
            Long id,
            String name,
            String email,
            String role
    ) {}

    public record MessageResponse(String message) {}
}
