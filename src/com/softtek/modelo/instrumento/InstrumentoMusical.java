package com.softtek.modelo.instrumento;

public abstract class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public abstract String emitirSonido();
}
