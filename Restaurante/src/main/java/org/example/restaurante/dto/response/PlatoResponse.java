package org.example.restaurante.dto.response;

public record PlatoResponse(
        String full_name,
        String description,
        double price,
        boolean isAvailable
) {
}
