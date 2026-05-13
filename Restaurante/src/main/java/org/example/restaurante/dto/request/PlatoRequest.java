package org.example.restaurante.dto.request;

import lombok.Builder;

@Builder
public record PlatoRequest(
        String full_name,
        String description,
        double price,
        boolean isAvailable
) {
}
