package com.fernan.miumg.pizza;

public  abstract class Pizza {
    private String nombre;
    private int tamano;
    private double precio;


    public Pizza(String nombre, int tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public abstract  void preparar();

    public abstract void hornear();

    public abstract void cortar();


    public abstract void empacar();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
