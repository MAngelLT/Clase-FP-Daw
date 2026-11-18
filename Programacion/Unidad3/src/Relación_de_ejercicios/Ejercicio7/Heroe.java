package Relación_de_ejercicios.Ejercicio7;

import java.nio.channels.Pipe.SourceChannel;

public class Heroe {

    //atributos

    private String nombre;
    private int vida;
    private int ataque;
    private Monstruo monstruo;



    //constructores

    public Heroe(){
        this.vida=100;

    }

    public Heroe(String nombre,int vida,int ataque){

        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;

    }

        //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    

    //Métodos

    public void recibirDaño(){

        this.vida = vida-monstruo.getAtaque();

    

    }

    public void mostrarInf(){

        System.out.println("El nombre del heroe es " +getNombre());
        System.out.println("La vida del hereo es :"+getVida());


    }

    public Monstruo getMonstruo() {
        return monstruo;
    }

    public void setMonstruo(Monstruo monstruo) {
        this.monstruo = monstruo;
    }



    



    
}
