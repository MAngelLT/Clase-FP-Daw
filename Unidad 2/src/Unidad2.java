import java.time.LocalDateTime;
import java.util.Scanner;

public class Unidad2 {
    /**
     * @autor Miguel Lapo Tuarez
     * @version 1.0
     * @param args
     * 
     * Unidad 2: Fudamentos de la programacion
     */
    public static void main(String[] args) {
        // int classes;
        // String caracter = "Miguel";
        // System.out.println("Hello World");
        //System.out.println((1+2+3+1)/3);
        //System.out.println((1+2+3+1)/3.0);
       //int []b={4,0,-1};
        //System.out.println(b[2]);

        //final int VALOR = 3;  // (final)Variable que en el momento que se le asigne un valor ya no se puede cambiar
        // Buena Practica dejar las Constante en matusculas para distinguirlas
         //short num = 4;


         // Las variables tienen que llevar un valor , si no arrastras código basura

        // int uno=1,dos=2,tres=3;
         //Declarar varias variables en una linea

        //  /*
        //  Este parrafo es un comentario
        //  asdasdf
        //  asd
        //  asdasdasf
        //  asd */

        // //Clase 2

        // // Ejemplo de introducir un valor por teclado
        // Scanner sc=new Scanner(System.in);
        // int numero;
        // System.out.println("Introduce un número entre 5 y 25");
        // numero=sc.nextInt(); 
        // System.out.println("El número introducido es:  " + numero);
        // sc.nextLine(); 
        // System.out.println("Introduce tu nombre: ");
        // String nombre=sc.nextLine();
        // System.out.println("Tu nombre es: " +nombre);
        //Nextline lee todo lo que ingreses, mejor usarlo al final
        //nex para leer de un en uno

     LocalDateTime hoy = LocalDateTime.now();
 System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
 System.out.println("El día es: " + hoy.getDayOfMonth());
 System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
 System.out.println("El año es: " + hoy.getYear());
 System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());
 System.out.println(Math.pow(2,5));

 int max=26;
 int min = 0;
 char letra='a';
 double aleatorio=(int)(Math.random()*(max-min+1)+min);
 System.out.println((char)letra+aleatorio);
 

    }
}

