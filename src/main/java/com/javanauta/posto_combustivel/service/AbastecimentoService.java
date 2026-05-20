package com.javanauta.posto_combustivel.service;

import com.javanauta.posto_combustivel.infrastructure.entitys.Abastacimento;
import com.javanauta.posto_combustivel.infrastructure.entitys.BombasDeCombustivel;
import com.javanauta.posto_combustivel.infrastructure.repository.AbastecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepository;

    private final BombaDeCombustivelService bombaDeCombustivelService;

    public void abastecer(Integer idBomba,Long litros){
        BombasDeCombustivel bomba = bombaDeCombustivelService.buscarBombaCombustivelPorId(idBomba);
        BigDecimal valorTotal=bomba.getTipoDeCombustivel()
                .getPrecoPorLitro()
                .multiply(BigDecimal.valueOf(litros));
        Abastacimento abastacimento = Abastacimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombasCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadeLitros(litros)
                .build();
        abastecimentoRepository.save(abastacimento);
    }

    public List<Abastacimento> buscarAbastecimento(){
        return abastecimentoRepository.findAll();
    }

}
