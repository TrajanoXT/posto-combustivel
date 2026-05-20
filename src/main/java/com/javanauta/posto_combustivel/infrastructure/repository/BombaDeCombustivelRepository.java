package com.javanauta.posto_combustivel.infrastructure.repository;

import com.javanauta.posto_combustivel.infrastructure.entitys.BombasDeCombustivel;
import com.javanauta.posto_combustivel.infrastructure.entitys.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Integer> {
}
