package Relación_de_ejercicios.Ejercicio7;

public class Monstruo {
    //atributos
    private String nombre;
    private int vida;
    private int ataque;
    private Heroe heroe;

     //constructores

    public Monstruo(){
        this.vida=100;

    }

    public Monstruo(String nombre,int vida,int ataque){

        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;

    }


        //getters y setters

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

    

    //método

    public void recibirDaño(){

        vida=vida-heroe.getAtaque();
        
        
    }

    public void mostarInf(){

    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }



    



    
    
}
