package Relación_de_ejercicios.Ejercicio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class personaVacia {

    public static void main(String[] args) {
        Persona persona1 = new Persona(); // persona con constructor por defecto

        try {
            Scanner leer = new Scanner(new File("./EjemploCSV.txt")); //Scanner para leer el fichero línea a línea

            while (leer.hasNextLine()) { //bucle que revisa si tiene más líneas
                String linea = leer.nextLine();      // variable que almacena una línea completa

                Scanner sc = new Scanner(linea);     // nuevo escaner para procesar solo una línea
                sc.useDelimiter(";");                //  se indica que los campos van separados por ;


                //guaradamos los siguientes datos en orden:
                persona1.setNombre(sc.next());          // la primera parte es nombre
                persona1.setEdad(sc.nextInt());         // la segunda parte es edad
                persona1.setTelefono(sc.next());        // la tercera parte es teléfono
                persona1.setPoblacion(sc.next());       // la cuarta parte es población

                persona1.imprimirInf();     // mostrar antes de pasar a la siguiente línea

                sc.close(); //cerramos el flujo de sc
            }

            leer.close();// cerramos el flujo del escaner conectado al fichero

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero. "+e.getMessage());
        }
    }


    
    
}
