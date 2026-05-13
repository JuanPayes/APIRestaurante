package org.example.restaurante.service;


import lombok.AllArgsConstructor;
import org.example.restaurante.dto.request.PlatoRequest;
import org.example.restaurante.dto.response.PlatoResponse;
import org.example.restaurante.entity.Plato;
import org.example.restaurante.repository.PlatoRepository;
import org.example.restaurante.utils.PlatoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlatoService {

    private PlatoRepository platoRepository;

    public void creatPlato(PlatoRequest plato){
        platoRepository.save(PlatoMapper.toEntity(plato));
    }

    public void deletePlato(int id){
        platoRepository.deleteById(id);
    }

    public List<Plato> findAllPlatos(){
        return platoRepository.findAll();
    }

    public PlatoResponse findPlatoById(int id){
        return PlatoMapper.toResponse(platoRepository.findById(id).get());
    }

    public void updatePlato(int id, PlatoRequest plato){
        Plato platoUpdate = PlatoMapper.toEntity(plato);
        if (platoRepository.existsById(id)){
            platoUpdate.setId(id);
        }
        platoRepository.save(platoUpdate);
    }
}
