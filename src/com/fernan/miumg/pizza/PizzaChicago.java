package com.fernan.miumg.pizza;

public class PizzaChicago  extends  Pizza{
    private String grosorMasa;

    public PizzaChicago(String nombre, int tamano, double precio, String estiloCorte) {
        super(nombre, tamano, precio);
        this.grosorMasa = grosorMasa;
    }


    public String getGrosorMasa() {
        return grosorMasa;
    }

    public void setEstiloCorte(String grosorMasa) {
        this.grosorMasa = grosorMasa;
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