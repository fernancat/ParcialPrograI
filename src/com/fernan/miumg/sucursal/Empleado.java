package com.fernan.miumg.sucursal;

public class Empleado {
    private String nombre;
    private String puesto;
    private int salario;

    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar(){
        System.out.println("El empleado: " + getNombre() + "\nPuesto: " + getPuesto() + "\n Esta trabajando");
    }

    public void tomarOrden(){
        System.out.println("El empleado: " + getNombre() + "\nPuesto: " + getPuesto() + "\n a tomado su orden");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


}
