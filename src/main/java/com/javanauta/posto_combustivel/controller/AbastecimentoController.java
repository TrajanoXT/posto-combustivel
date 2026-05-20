package com.javanauta.posto_combustivel.controller;

import com.javanauta.posto_combustivel.infrastructure.entitys.Abastacimento;
import com.javanauta.posto_combustivel.service.AbastecimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abastecimento")
@RequiredArgsConstructor
public class AbastecimentoController {
    private final AbastecimentoService abastecimentoService;

    @PostMapping
    public ResponseEntity<Void> abastecer(@RequestParam("quantidadeEmLitros")Long litros,
                                          @RequestParam("idBomba") Integer idBomba){
        abastecimentoService.abastecer(idBomba, litros);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<List<Abastacimento>> buscarAbastecimentos(){
        return ResponseEntity.ok(abastecimentoService.buscarAbastecimento());
    }

}
