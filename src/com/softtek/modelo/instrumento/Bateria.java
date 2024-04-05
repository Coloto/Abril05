package com.softtek.modelo.instrumento;

public class Bateria extends InstrumentoMusical{
    private int nPlatillos;

    public Bateria(String marca, int nPlatillos) {
        super(marca);
        this.nPlatillos = nPlatillos;
    }

    public String emitirSonido() {
        return "Sonido de bateria";
    }
}
