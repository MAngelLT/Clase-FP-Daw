package Relación_de_ejercicios.Ejercicio6;

public class Jugador {

    //Atributos
    private String nombre;
    private int edad;
    private Carta carta;



    //Constructor

    public  Jugador(){

    }    

    public Jugador (String nombre, int edad, Carta carta){
        this.nombre=nombre;
        this.edad=edad;
        this.carta=carta;



    }

    public void imprimeJugador(){
        System.out.println("El nombre del 1er jugador es: " );
    }

    public static void main(String[] args) {
        
        
        Jugador J1=new Jugador("Ana", 20,);
    }

    
}
