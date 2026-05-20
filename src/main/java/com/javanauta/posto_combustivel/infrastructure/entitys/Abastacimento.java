package com.javanauta.posto_combustivel.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "abastecimento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Abastacimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "bomba_combustivel")
    private BombasDeCombustivel bombasCombustivel;
    @Column(name = "data_abastecimento")
    private LocalDate dataAbastecimento;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Column(name = "quantidade_litros")
    private Long quantidadeLitros;

}
