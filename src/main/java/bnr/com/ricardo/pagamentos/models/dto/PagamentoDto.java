package bnr.com.ricardo.pagamentos.models.dto;

import bnr.com.ricardo.pagamentos.models.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoDto {

    @JsonProperty
    private Long id;

    @JsonProperty("valor")
    private BigDecimal valor;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("expiracao")
    private String expiracao;

    @JsonProperty("codigo")
    private String codigo;

    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("pedido_id")
    private Long pedidoId;

    @JsonProperty("forma_pagamento_id")
    private Long formaPagamentoId;
}
