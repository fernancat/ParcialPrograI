package com.fernan.miumg.ingrediente;

public class Salsa  implements Ingrediente {
    private String nombre;
    private int cantidad;
    private String sabor;

    public Salsa(String nombre, int cantidad, String sabor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.sabor = sabor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }
}
