
package br.ucs.constants;

public enum AcaoDBEnum {

    INSERT("I"),
    UPDATE("E"),
    DELETE("R");

    private String codigo;

    AcaoDBEnum(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

}
