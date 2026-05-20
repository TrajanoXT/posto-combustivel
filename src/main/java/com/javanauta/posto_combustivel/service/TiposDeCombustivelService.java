package com.javanauta.posto_combustivel.service;

import com.javanauta.posto_combustivel.infrastructure.entitys.TiposDeCombustivel;
import com.javanauta.posto_combustivel.infrastructure.repository.BombaDeCombustivelRepository;
import com.javanauta.posto_combustivel.infrastructure.repository.TipoDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {
    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;

    public void criar(TiposDeCombustivel tipoDeCombustivel) {
        tipoDeCombustivelRepository.save(tipoDeCombustivel);
    }

    public TiposDeCombustivel buscarTiposDeCombustivelPorID(Integer id) {
        return tipoDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Tipo de combustivel nao encontrado pelo id -> "+id));
    }
    public List<TiposDeCombustivel> buscarTiposDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }
    @Transactional
    public void deletarTipoDeCombustivel(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }
    public void alterarTipoDeCombustivel(Integer id, TiposDeCombustivel tipoDeCombustivel) {
        TiposDeCombustivel combustivel = buscarTiposDeCombustivelPorID(id);
        tipoDeCombustivel.setId(combustivel.getId());
        tipoDeCombustivelRepository.save(tipoDeCombustivel);
    }

}
