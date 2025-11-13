package bnr.com.ricardo.pagamentos.models.enums;

public enum StatusEnum {
    CRIADO(0, "Criado"),
    CONFIRMADO(1, "Confirmado"),
    CANCELADO(2, "Cancelado");

    private int code;
    private String description;

    StatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
