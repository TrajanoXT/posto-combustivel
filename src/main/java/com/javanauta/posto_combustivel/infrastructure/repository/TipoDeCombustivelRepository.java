package com.javanauta.posto_combustivel.infrastructure.repository;

import com.javanauta.posto_combustivel.infrastructure.entitys.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository<TiposDeCombustivel, Integer> {
}
