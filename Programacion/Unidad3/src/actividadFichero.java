import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class actividadFichero {


    public static void leerFichero(){

        System.out.println("Ingresa una palabra");


        try{
            File fichero =new File("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt");

            if (!fichero.exists() && !fichero.isFile()){
                System.out.println("El fichero no existe O no es un fichero");

            }
            else{
                Scanner teclado=new Scanner(System.in);
                System.out.println("Ingresa  la palabra que quieres  buscar en el archivo");                
                String palabraBUscada = teclado.next();

                int contador=0 ;



                Scanner sc=new Scanner(fichero);

                while (sc.hasNextLine()){
                    String linea = sc.nextLine();
                    System.out.println(linea);
                    Scanner scLinea = new Scanner(linea);
                    scLinea.useDelimiter("[,//s]+");
                    
                    
                    while (scLinea.hasNext()){

                        String palabra = scLinea.next();




                        if(palabra.equalsIgnoreCase(palabraBUscada)){
                            contador++;
                        }
                        
                    }

                    scLinea.close();
                }

                sc.close();

                System.out.println("La palabra '"+ palabraBUscada + "' aparece "+contador + " veces.");

            }





            




            
        }catch(Exception e){
            System.out.println(e.getMessage());

            System.out.println("Error al leer el fichero.");
        }


        
    }

    public static void copiarArchivo (String ruta){

        try{
            File fichero = new File(ruta);


            if (!fichero.exists() && !fichero.isFile()) {
            System.out.println("El fichero no existe");
            return;
            }

            String nombre =fichero.getName(); //Guardamos el nombre del fichero en la variable nombre

            int posicionPunto = nombre.lastIndexOf('.');

            String nombreSinExtension;
            String extension;

            if (posicionPunto > 0) {
                nombreSinExtension = nombre.substring(0, posicionPunto);    //archivos sin extension
                extension = nombre.substring(posicionPunto);
            } else {
                nombreSinExtension = nombre;
                extension = "";
            }





            LocalDate fecha=LocalDate.now();

            String nuevoNombre = nombreSinExtension+"_copia_"+
            fecha.getYear()+ "_"+
            fecha.getMonth()+"_"+    // Le damos el nombre al fichero que vamos a crear para que cumpla los requisitos de la TAREA 
            fecha.getDayOfMonth()+
            ".txt";

            File copia = new File(fichero.getParent(),nuevoNombre);

        



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


            System.out.println("Copia creada "+ copia.getName());

        }catch(Exception e){

            System.out.println(e.getMessage());
        }
    }








    public static void main(String[] args) {



        // leerFichero();
        copiarArchivo(null);
        
















    }
    
}
