package org.example.restaurante.utils;

import org.example.restaurante.dto.request.PlatoRequest;
import org.example.restaurante.dto.response.PlatoResponse;
import org.example.restaurante.entity.Plato;

public class PlatoMapper {

    public static Plato toEntity(PlatoRequest platoRequest) {
        return Plato.builder()
                .name(platoRequest.full_name())
                .description(platoRequest.description())
                .price(platoRequest.price())
                .isAvailable(platoRequest.isAvailable())
                .build();
    }

    public static PlatoResponse toResponse(Plato plato) {
        return new PlatoResponse(
                plato.getName(),
                plato.getDescription(),
                plato.getPrice(),
                plato.isAvailable()
        );
    }

}
