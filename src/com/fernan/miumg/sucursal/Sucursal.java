package com.fernan.miumg.sucursal;

import com.fernan.miumg.ingrediente.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

    private String nombre;
    List<Empleado> empleados = new ArrayList<>();
    List<Ingrediente> ingredientes = new ArrayList<>();
    List<Equipo> equipos = new ArrayList<>();
    List<String> especialidades = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sucursal(String nombre){
        this.nombre = nombre;
        System.out.println("Se ha creado la sucusal " + nombre);
    }

    public Empleado agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);

        System.out.println("El empleado se ha agregado correctamente: " + empleado.getNombre());
        return empleado;
    }

    private Ingrediente agregarIngrediente(Ingrediente ingrediente) {

        ingredientes.add(ingrediente);

        System.out.println("El empleado se ha agregado correctamente: " + ingrediente.getNombre());
        return ingrediente;
    }


    public Equipo agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("El empleado se ha agregado correctamente: " + equipo.getTipo());
        return equipo;
    }

    public String agregarEspecialidad(String especialidad) {
        especialidades.add(especialidad);
        System.out.println("Se ha agregado la especialidad: " + especialidad);
        return especialidad;
    }




}
