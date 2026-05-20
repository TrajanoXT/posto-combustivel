package com.javanauta.posto_combustivel.controller;


import com.javanauta.posto_combustivel.infrastructure.entitys.Abastacimento;
import com.javanauta.posto_combustivel.infrastructure.entitys.TiposDeCombustivel;
import com.javanauta.posto_combustivel.service.TiposDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/tiposDeCombustivel")
@RequiredArgsConstructor
public class TiposDeCombustivelController {

    private final TiposDeCombustivelService tiposDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody TiposDeCombustivel tiposDeCombustivel) {
        tiposDeCombustivelService.criar(tiposDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<TiposDeCombustivel>> buscarTiposDeCombustivel(){
        return ResponseEntity.ok(tiposDeCombustivelService.buscarTiposDeCombustivel());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiposDeCombustivel> buscarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(tiposDeCombustivelService.buscarTiposDeCombustivelPorID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        tiposDeCombustivelService.deletarTipoDeCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarTipoDeCombustivel(@RequestParam(name = "id")Integer id, @RequestBody TiposDeCombustivel tiposDeCombustivel){
        tiposDeCombustivelService.alterarTipoDeCombustivel(id, tiposDeCombustivel);
        return ResponseEntity.ok().build();
    }

}
