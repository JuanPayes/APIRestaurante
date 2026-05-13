package org.example.restaurante.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class GeneralResponse {
    Object data;
    String message;
}
