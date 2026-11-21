package Relación_de_ejercicios.Ejercicio6;

public class Jugador {

    //Atributos
    private String nombre;
    private int edad;
    private Carta carta;



    //Constructores

    public  Jugador(){
        this.nombre="Desconocido";
        this.edad=0;
        this.carta=null;


    }    

    public Jugador (String nombre, int edad, Carta carta){
        this.nombre=nombre;
        this.edad=edad;
        this.carta=carta;

    }

    // Constructor de copia
    public Jugador(Jugador otro) {
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.carta = new Carta(otro.carta);
    }


    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    //métodos
    public void imprimeJugador(){
        System.out.println("El nombre del jugador es: " + this.nombre +" y su edad es: "+this.edad);
        if (carta!=null){
            carta.imprimeCarta();
        } else {
            System.out.println("Todavía no tiene carta");
        }
    }



    
}
