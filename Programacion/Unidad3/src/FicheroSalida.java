import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroSalida {
    public static void main(String[] args) {
        
            //Escribir por pantalla 
            System.out.println("Hola mundo");

            //Hacer lo mismo con PRINTWHRITER

            String contenido = "Me llamo Miguel";
            try{
                PrintWriter escritor= new FileWriter("ejemplo.txt");

                BufferedWriter escritor = new BufferedWriter(archivo);
                escritor.write(contenido); // Escribimos la cadena en el archivo
                escritor.newLine(); // Añadimos una nueva línea
                escritor.close(); // Cerramos el BufferedWriter
                System.out.println("¡Archivo escrito con éxito!");

        

            } catch (IOException e) {
                e.printStackTrace();
            }
    

    }
    
    
}
