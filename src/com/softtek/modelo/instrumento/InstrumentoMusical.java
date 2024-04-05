package com.softtek.modelo.instrumento;

public class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String emitirSonido() {
        return "sonido";
    }
}
