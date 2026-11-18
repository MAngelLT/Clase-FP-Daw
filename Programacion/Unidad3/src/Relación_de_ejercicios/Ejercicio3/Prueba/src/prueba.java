package Relación_de_ejercicios.Ejercicio3.Prueba.src;

import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.cliente;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.empleado;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.fabrica;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.producto;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.sucursal;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.tarjeta;


public class prueba {

    

    public static void main(String[] args) {
        //Creamos una Fábrica la imprimimos
        fabrica fabrica1 = new fabrica(30712345, "Fábrica Central", "España", "Carlos Gómez", 150);
        fabrica1.imprimir();

        //Creamos un Producto que esta asociado a la Fábrica (Relación 1:1) lo imprimimos
        producto producto1 = new producto(101, "Sierra", "Morada", 89.99, fabrica1);
        producto1.imprimir();

        //Creamos un Cliente y lo imprimimos
        cliente cliente1 = new cliente(1, "77777777A", "Jerónimo", "10/07/2000", "Cuenca");
        cliente1.imprimir();

        //Creamos una Tarjeta asociada al Cliente lo imprimimos
        tarjeta tarjeta1 = new tarjeta(1, "Visa", "13/05/2030", 2323423, cliente1);
        tarjeta1.imprimir();

        //Creamos una Sucursal donde el Cliente realiza una compra y lo imprimimos
        sucursal sucursal1 = new sucursal(10, "Calle Mayor 12", "Madrid", cliente1, 15.0);
        sucursal1.imprimir();

        //Creamos un Empleado y lo imprimimos
        empleado empleado1 = new empleado("12345678B", "Ana Pérez", "L-998", 912345678, "Calle Falsa 123");
        empleado1.imprimir();

        //Relacionamos Empleado y Sucursal con trabajar y lo imprimimos
        trabaja trabajo1 = new trabaja(sucursal1, empleado1, "Lunes", "08:00 - 16:00");
        trabajo1.imprimir();

        //Relacionamos Sucursal y Producto con  la clase vende y lo imprimimos
        vende venta1 = new vende(sucursal1, producto1, 99.99);
        venta1.imprimir();
    }
}