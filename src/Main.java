import com.fernan.miumg.pizza.Pizza;
import com.fernan.miumg.pizza.PizzaChicago;
import com.fernan.miumg.sucursal.Empleado;
import com.fernan.miumg.sucursal.Equipo;
import com.fernan.miumg.sucursal.Sucursal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        Sucursal sucursal = new Sucursal("fernandino");
        Empleado empleado = new Empleado("Dimas Lawrence", "Repartidor", 6500);
        Equipo equipo = new Equipo("Horno", true);

        //agregaciones

        sucursal.agregarEmpleado(empleado);
        sucursal.agregarEquipo(equipo);


        if (sucursal.getEmpleados() != null || !sucursal.getEmpleados().isEmpty() && sucursal.getEquipos()!= null && !sucursal.getEquipos().isEmpty()) {
            int opcion = 0;
            do {
                mostrarMenu(sucursal);

                opcion = consola.nextInt();
                switch (opcion) {
                    case 1:
                        Pizza pizzaChicago = new PizzaChicago("Pizza Chicago", 10, 200, "doble");
                        empleado.tomarOrden(pizzaChicago);
                        break;
                    case 2:
                        Pizza pizzaNuevaYork = new PizzaChicago("Pizza Nueva York", 20, 400, "cuadruple");
                        empleado.tomarOrden(pizzaNuevaYork);
                        break;

                }

            }while (opcion != -1);
        }else{
            System.out.println("No hay empleados disponibles en la sucursal");
        }


    }


    public static void mostrarMenu(Sucursal sucursal){
        System.out.println("*************************************");
        System.out.println("Bienvenido a la pizzeria " + sucursal.getNombre());
        System.out.println("*************************************");
        System.out.println("Tenemos dos especialidades para ti: \n 1. PizzaChicago \n 2. PizzaNuevaYork" );
        System.out.println("Elige la opcion adecuada: ");

    }
}