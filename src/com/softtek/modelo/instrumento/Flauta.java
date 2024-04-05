package com.softtek.modelo.instrumento;

public class Flauta extends InstrumentoMusical{
    private String material;

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String emitirSonido() {
        return "Sonido de flauta";
    }
}
