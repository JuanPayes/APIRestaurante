package org.example.restaurante.service;


import lombok.AllArgsConstructor;
import org.example.restaurante.dto.request.PlatoRequest;
import org.example.restaurante.repository.PlatoRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlatoService {

    private PlatoRepository platoRepository;

    public void creatPlato(PlatoRequest plato){
        platoRepository.save()
    }
}
