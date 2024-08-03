package com.fernan.miumg.pizza;

public class PizzaNuevaYork  extends  Pizza{
    private String estiloCorte;

    public PizzaNuevaYork(String nombre, int tamano, double precio, String estiloCorte) {
        super(nombre, tamano, precio);
        this.estiloCorte = estiloCorte;
    }

    public String getEstiloCorte() {
        return estiloCorte;
    }

    public void setEstiloCorte(String estiloCorte) {
        this.estiloCorte = estiloCorte;
    }

    @Override
    public void preparar() {

        System.out.println("Preparando... " + getNombre());
    }

    @Override
    public void hornear() {
        System.out.println("horneando..." + getNombre() );
    }

    @Override
    public void cortar() {
        System.out.println("cortando..." + getNombre() );
    }

    @Override
    public void empacar() {
        System.out.println("empacando: " + getNombre());
    }
}
