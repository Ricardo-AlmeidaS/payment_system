package bnr.com.ricardo.pagamentos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    @Column(name = "valor")
    private BigDecimal valor;

    @NotBlank
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;

    @NotBlank
    @Size(max = 19)
    @Column(name = "numero")
    private String numero;

    @NotBlank
    @Size(max = 7)
    @Column(name = "expiracao")
    private String expiracao;

    @NotBlank
    @Size(min = 3, max = 3)
    @Column(name = "codigo")
    private String codigo;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEnum status;

    @NotNull
    @Column(name = "pedido_id")
    private Long pedidoId;

    @NotNull
    @Column(name = "forma_pagamento_id")
    private Long formaPagamentoId;
}
