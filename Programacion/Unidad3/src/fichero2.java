import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fichero2 {

    public static void leerDatos(String ruta) {
        int partidasJugador1=0,partidasJugador2=0;
        try {
            Scanner sc = new Scanner(new File(ruta)); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
            while (sc.hasNextLine()) {
                String linea = sc.nextLine(); //Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
                scLinea.useDelimiter("[=\\s]+");
                String jugador = scLinea.next();
                int partidas = scLinea.nextInt();
                if (jugador.equals("jugador1")) { //Compruebo si he leído jugador1
                    partidasJugador1 = partidas;
                } else if (jugador.equals("jugador2")) {
                    partidasJugador2 = partidas;
                }
                scLinea.close();
            }
            System.out.println(partidasJugador1+"-"+partidasJugador2);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero.");
        }
    }

        public static void leerDatos2(String ruta) {
        int partidasJugador1=0,partidasJugador2=0,partidasJugador3=0;
        try {
            Scanner sc = new Scanner(new File(ruta)); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
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
    public static void main(String[] args) {
        leerDatos2("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/victoria.txt"); //se añadio static en el procedimiento
        
    }
    
}
