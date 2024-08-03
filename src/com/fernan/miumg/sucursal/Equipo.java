package com.fernan.miumg.sucursal;

public class Equipo {
    private String tipo;
    private boolean estado;
    private String nombre;

    public Equipo(String tipo, boolean estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public void encender(){
        estado = true;

        System.out.println("El equipo esta encendido");
    }

    public void reparar(){
        estado = false;
        System.out.println("El equipo esta reparando");
        estado = true;
    }

    public void apagar(){
        estado = false;
        System.out.println("El equipo esta apagado");
    }


}