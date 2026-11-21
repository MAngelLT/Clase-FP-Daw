package Relación_de_ejercicios.Ejercicio7;

public class Monstruo {
    //atributos
    private String nombre;
    private int vida;
    private int ataque;
  

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

     public void recibirDaño(int daño){

        this.vida = this.vida - daño;
        if (this.vida < 0) {//condicional para mantener el valor de vida por encima de-1
            this.vida = 0;
        }

    

    }


    public void mostarInf(){
        System.out.println("Monstruo:  " +this.nombre);
        System.out.println("La vida del monstruo es : "+this.vida+ " y su ataque es de : "+ this.ataque);

    }



    



    
    
}
