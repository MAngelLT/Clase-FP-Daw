package Relación_de_ejercicios.Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class unirFicheros {


    public static void pegarFicheros(String fichero1, String fichero2, String ficheroNuevo){
        // le añadimos el valor nulo a las varibles que usaremos
        BufferedReader leer1 = null;
        BufferedReader leer2 = null;
        BufferedWriter escribir= null;



        try {


            // Usamos la ruta dada por el usuario 
            File archivo1=new File(fichero1);
            File archivo2=new File(fichero2);

            
            // File archivoUnido = new File(ficheroNuevo);

            // guardamos en una variable el nombre del fichero
            String nombreF1= archivo1.getName();
            String nombreF2= archivo2.getName();

            // Quitamos la extensión .txt  para combinar los nombres 
            if (nombreF1.toLowerCase().endsWith(".txt")) { //convertimos el nombre en minuscula 
                nombreF1 = nombreF1.substring(0, nombreF1.lastIndexOf('.')); //guardamos el txto del inicio hasta el punto
            }
            if (nombreF2.toLowerCase().endsWith(".txt")) {
                nombreF2 = nombreF2.substring(0, nombreF2.lastIndexOf('.'));
            }

            //  Creamos el nombre del fichero nuevo
                String nombreNuevo = nombreF1 + "_" + nombreF2 + ".txt";

             // Declaramos su ruta y nombre

                File archivoUnido = new File(ficheroNuevo,nombreNuevo);
            

            
            
            // Guardamos un nuevo flujo de lectura en las variables
            leer1= new BufferedReader( new FileReader(archivo1));
            leer2= new BufferedReader(new FileReader(archivo2));
            escribir= new BufferedWriter(new FileWriter(archivoUnido));

            String linea;

            // BUCLE para guardar el contenido del archivo1 en archivoUnido
            while ((linea = leer1.readLine()) != null) { // Mientras no haya una linea vacia en leerAcrivo1 
                escribir.write(linea);
                escribir.newLine();//salto de linea
            }

            // BUCLE para guardar el contenido del archivo2 en archivoUnido

            while ((linea = leer2.readLine()) != null) { // Mientras no haya una linea vacia en leerAcrivo1 
                escribir.write(linea);
                escribir.newLine();//salto de linea
            }

            //Cerramos los flujos de ewscritura  y lectura
            leer1.close();
            leer2.close();
            escribir.close();


            System.out.println("Ficheros unidos con éxito!!!");
            

                        
            
            


            
        } catch (Exception e) {
            System.out.println("Error en: "+e.getMessage());
            
        }finally{
            

        }

    }


    public static void main(String[] args) {


        pegarFicheros("./src/Relación_de_ejercicios/Ejercicio4/A.txt","./src/Relación_de_ejercicios/Ejercicio4/B.txt", "./src/Relación_de_ejercicios/Ejercicio4");





    }
    
}
