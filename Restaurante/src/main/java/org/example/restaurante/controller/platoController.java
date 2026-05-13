package org.example.restaurante.controller;


import lombok.AllArgsConstructor;
import org.example.restaurante.dto.GeneralResponse;
import org.example.restaurante.dto.request.PlatoRequest;
import org.example.restaurante.entity.Plato;
import org.example.restaurante.service.PlatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/platos")
@AllArgsConstructor
public class platoController {

    private final PlatoService platoService;

    @GetMapping
    public ResponseEntity<GeneralResponse> getAllPlatos(){
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(platoService.findAllPlatos())
                .message("Todos los platos encontrados")
                .build());
    }

    @PostMapping
    public ResponseEntity<GeneralResponse> createPlato(@RequestBody PlatoRequest platoRequest){
        platoService.creatPlato(platoRequest);
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(platoRequest)
                .message("Plato creado correctamente")
                .build());
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<GeneralResponse> updatePlato(@PathVariable int id, @RequestBody PlatoRequest plato) {
        platoService.updatePlato(id, plato);
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(platoService.findPlatoById(id))
                .message("Plato actualizado correctamente")
                .build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GeneralResponse> deletePlato(@PathVariable int id) {
        platoService.deletePlato(id);
        return ResponseEntity.ok(GeneralResponse.builder()
                .message("Plato eliminado correctamente")
                .build());
    }
}
