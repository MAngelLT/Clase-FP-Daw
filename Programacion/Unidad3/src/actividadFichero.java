import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class actividadFichero {


    public static void leerFichero(){

        System.out.println("Ingresa una palabra");


        try{
            File fichero =new File("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt");

            



            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresa  la palabra a buscar");
            
            String palabraBuscada;



            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        
    }

    public static void copiarArchivo (){

        try{

            if()

            //Tengo un archivo para leer

            Scanner ficheroLeer = new Scanner("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt");


            //Tengo un archivo para escribir
            PrintWriter ficheroEscribir= new PrintWriter("./FicheroEjemplo2.txt");


            //Mientras tenga una linea en el fichero
            while(ficheroLeer.hasNextLine()){
                String linea=ficheroLeer.nextLine();  //lees una linea la ingresas en la varible linea
                ficheroEscribir.println(linea);        // imprime la informacion de linea  
                
            }
            ficheroLeer.close();
            ficheroEscribir.close();

        }catch(Exception e){

            System.out.println(e.getMessage());
        }
    }








    public static void main(String[] args) {



        // leerFichero();
        copiarArchivo();
        
















    }
    
}
