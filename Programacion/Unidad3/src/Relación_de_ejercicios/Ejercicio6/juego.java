package Relación_de_ejercicios.Ejercicio6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class juego {
    //atributos 
    private int ganadas1;
    private int ganadas2;
    
    
    public juego(){//valor por defecto 0
        ganadas1=0;
        ganadas2=0;
    }
    //getters y setters
    
    public int getGanadas1() {
        return ganadas1;
    }

    public void setGanadas1(int ganadas1) {
        this.ganadas1 = ganadas1;
    }

    public int getGanadas2() {
        return ganadas2;
    }

    public void setGanadas2(int ganadas2) {
        this.ganadas2 = ganadas2;
    }



    //creamos un metodo para contar las partidas ganadas de cada jugador
    public void contarGanadas1(){
        ganadas1++;
    }
    public void contarGanadas2(){
        ganadas2++;
    }
    // Creamos esta funcion para no jugar con solo un tipo de carta
    public Carta cartaRandom(){
        int valor =(int) (Math.random() * 12) + 1; //Lo usamos con el min y max de cartas
        Palo palo = Palo.values()[(int) (Math.random() * Palo.values().length)]; // metodo que lee y genera un valor aleatorio de un Enum
        return new Carta(valor, palo); 
    }



    public void cartaAlta(Jugador jugador1, Jugador jugador2){
 

        while (ganadas1 != 3 && ganadas2 != 3) { // Límite de victorias
           
            jugador1.setCarta(cartaRandom());   // Se le da valor a las cartas de los jugadores
            jugador2.setCarta(cartaRandom());   // Cambian de cartas cada bucle

            jugador1.imprimeJugador(); //imprimimos inf
            jugador2.imprimeJugador();

            int victoriaJ1 = jugador1.getCarta().getValor(); //cremos variables donde almacena la inf de las cartas de los jugadores
            int victoriaJ2 = jugador2.getCarta().getValor();

            //  Condicional para decidir el ganador
            if (victoriaJ1 > victoriaJ2) {
                contarGanadas1();
                System.out.println("Gana " + jugador1.getNombre());
            } else if (victoriaJ2 > victoriaJ1) {
                contarGanadas2();
                System.out.println("Gana " + jugador2.getNombre());
            } else {
                System.out.println("Empate");
            }
            System.out.println("El jugador "+jugador1.getNombre()+" ganó " + ganadas1 + " partidas");
            System.out.println("El jugador "+jugador2.getNombre()+" ganó " + ganadas2 + " partidas");
            System.out.println("------------------------------------------------------------");
        }

        historialPartidas();//Guardamos la inf de las partidas en un txt


    }

    public void historialPartidas() {
        try {
            PrintWriter escribir = new PrintWriter(new FileWriter("Historial_de_Partidas.txt", true)); // añadimos true en el parámetro para que no se sobreescriba
            escribir.println("Partidas ganadas del jugador1=" + ganadas1 + ", Partidas ganadas del jugador2=" + ganadas2);
            escribir.close();//Cierra el fichero
        } catch (IOException e) {
            System.out.println("Error al guardar el Historial de partidas: " + e.getMessage());
        }
    }


    





public static void main(String[] args) {

//Creamos a los jugadores 
    Jugador jugador1=new Jugador("Sol", 30, null);
    Jugador jugador2=new Jugador("Luna", 20, null);
    
    juego juego1=new juego();
    juego1.cartaAlta(jugador1, jugador2);
        
    
}

}
