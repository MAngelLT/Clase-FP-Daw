import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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





        // try{
        //     Scanner leer = new Scanner(new File("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt"));
        //     String linea;
        //     while(leer.hasNextLine()){
        //         linea=leer.nextLine(); // Lee una linea completa
        //         System.out.println(linea);
        //         Scanner sc = new Scanner(linea);//Procesar la línea leída
        //         // int numero1=sc.nextInt();
        //         // int numero2=sc.nextInt();
        //         // int numero3=sc.nextInt();
        //         int numero1=leer.nextInt();
        //         int numero2=leer.nextInt();
        //         int numero3=leer.nextInt();

        //         System.out.println(numero1+"-"+numero2+"-"+numero3);
        //     }
        //     leer.close();// Cerrarlo tras su uso
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }


        // 
        // try{
        //     Scanner leer = new Scanner(new File("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt"));
        //     String linea;
        //     int suma=0;
        //     double contador=0;
        //     //procesamos el archivo linea a linea
        //     while(leer.hasNextLine()){
        //         //Guardo la linea a leer
        //         linea=leer.nextLine();
        //         System.out.println("Linea a procesar"+ linea);
        //         Scanner sc=new Scanner(linea);

        //         suma =0;
        //         contador=0;
        //         while(sc.hasNextInt()){//Dentro de la linea voy leyendo los números
        //             int numero1=sc.nextInt();
        //             contador++;
        //             suma+=numero1;


        //         }


        //         
        //         System.out.println("Media de la linea : "+ suma/contador);
        //         sc.close();//Cerramos la lectura de esa linea(opcional)

        //     }

        //         leer.close();// Cerrarlo tras su uso

        
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }


         // Lectura de N´meros con lemitadores
    // try{
    //     Scanner leer = new Scanner(new File("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt"));
    //     String linea;
    //     while(leer.hasNextLine()){
    //         linea=leer.nextLine(); // Lee una linea completa
    //         System.out.println(linea);
    //         Scanner sc = new Scanner(linea);//Procesar la línea leída
    //         sc.useDelimiter("[;\\s/]+");  //Control del delimitador(elimina de tu linea ";")  // Dentro del corchete se añade los que necesitemos filtrar
    //         // a-z A-Z letras
    //         int numero1=sc.nextInt();
    //         int numero2=sc.nextInt();
    //         int numero3=sc.nextInt();


    //         System.out.println(numero1+"-"+numero2+"-"+numero3);
    //     }
    //     leer.close();// Cerrarlo tras su uso
    // }catch(Exception e){
    //     System.out.println(e.getMessage());
    // }





        //actividad ??  arreglar**

        int partidasJugador1=0,partidasJugador2=0,partidasJugador3=0;
        try {
            Scanner sc = new Scanner(new File("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/victoria.txt")); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
            while (sc.hasNextLine()) {
                String linea = sc.nextLine(); //Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen

                while(scLinea.hasNext()){
                    scLinea.useDelimiter("[=\\s]+");
                    String jugador = scLinea.next();
                    int partidas = scLinea.nextInt();

                    if (jugador.equals("jugador1")) { //Compruebo si he leído jugador1
                        partidasJugador1 = partidas;
                    }
                    else if (jugador.equals("jugador2")) {
                        partidasJugador2 = partidas;
                    }
                    else {
                        partidasJugador3 = partidas;
                    }

                }
               

                scLinea.close();
            }
            System.out.println(partidasJugador1+"-"+partidasJugador2+"-"+partidasJugador3);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero.");
        }



    }

}
