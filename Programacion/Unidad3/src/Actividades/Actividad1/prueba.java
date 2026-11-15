package Actividades.Actividad1;
import Actividades.Actividad1.CuentaCorriente;
import Actividades.Actividad1.Persona3;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.cliente;

public class prueba {

    public static void main(String[] args) {


        //Se crea un objeto persona
        Persona3 p1=new Persona3("Alexi","12345678A","12/12/2012","Calle Bolivar",'M',false);

        //Se crea un objeto cuenta con referencia a la persona anterior
        CuentaCorriente cuenta1=new CuentaCorriente(p1, "ES2134345332", 300);

        //Primer imprime sin cambios

        cuenta1.imprimeCuenta(); //imprimimo cuenta1 para que nos de la inf del cliente y de la cuenta


        //modifico con setters
        cuenta1.setSaldo(400.5);
        p1.setSoltero_casado(true);

        //imprimo con los nuevos cambios añadidosç

        cuenta1.imprimeCuenta();

    }

    
}
