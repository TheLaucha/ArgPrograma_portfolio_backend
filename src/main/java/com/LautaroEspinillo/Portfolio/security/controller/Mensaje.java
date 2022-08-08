package com.LautaroEspinillo.Portfolio.security.controller;

public class Mensaje {
    private String mensaje;

    // Constructores
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    // Getter & Setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
