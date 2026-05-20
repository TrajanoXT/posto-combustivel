package com.javanauta.posto_combustivel.infrastructure.repository;

import com.javanauta.posto_combustivel.infrastructure.entitys.Abastacimento;
import com.javanauta.posto_combustivel.infrastructure.entitys.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<Abastacimento, Integer> {
}
