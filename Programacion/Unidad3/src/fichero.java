import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class fichero {

    public static void main(String[] args) {
        // try{
        
        //     File fichero = new File("C:\\Users\\usuario\\Desktop\\Programación\\Clase-FP-Daw\\Programacion\\Unidad3");

        //     if (fichero.exists()){
        //         System.out.println("Nombre del archivo"+fichero.getName());
        //         System.out.println("Ruta "+ fichero.getPath());
        //         System.out.println("Ruta absoluta "+ fichero.getAbsolutePath());
        //         System.out.println("Se puede escribir " + fichero.canRead());
        //         System.out.println("Se puede leer "+fichero.canWrite());
        //         System.out.println("Tamaño "+fichero.length());

        //     }


        
        // else{
        //     throw new Exception("No existe el archivo");
        // }
        
        
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
         
        // }
        


        // File archivo = null;
        // FileReader reader =null;
        // BufferedReader buffer =null;
        // try {
        //     BufferedReader leer= new BufferedReader(new FileReader("../FicheroEjemplo.txt"));

        //     String linea;
        //     while((linea=leer.readLine()) != null){
        //         System.out.println(linea);
        //     }
        // } catch (Exception e) {
        // System.out.println(e.getMessage());   
        // }    
        // // fichero.close();





        try {Scanner leer = new Scanner(new File("C:\\Users\\usuario\\Desktop\\Programación\\Clase-FP-Daw\\Programacion\\Unidad3"));
            String linea;
            while (leer.hasNextLine()) {
                System.out.println(leer.nextLine());
                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }

}
