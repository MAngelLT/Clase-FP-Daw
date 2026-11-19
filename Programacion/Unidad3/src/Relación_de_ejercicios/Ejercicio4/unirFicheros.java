package Relación_de_ejercicios.Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class unirFicheros {


    public static void main(String[] args) {

        // guardamos en una variable la ubicación  del archivo 
        File archivo1=new File("");
        File archivo2=new File("null");
        File archivoUnido = new File("./Ejercicio4");


        
        try {

            
            // Lee el archivo
            BufferedReader leerArchivo1=new BufferedReader( new FileReader(archivo1));
            BufferedReader leerArchivo2 =new BufferedReader(new FileReader(archivo2));

            //Escrib
            BufferedWriter escribirArchivo1=new BufferedWriter(new FileWriter(archivoUnido));

            String linea;

            while ((linea = leerArchivo2.readLine()) != null) {
                escribirArchivo1.write(linea);
                escribirArchivo1.newLine();
            }
            

                        
            
            


            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }



    }
    
}
