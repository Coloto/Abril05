package com.softtek.modelo.instrumento;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerdas;

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public String emitirSonido(){
        return "Sonido de guitarra";
    }
}
