package Relación_de_ejercicios.Ejercicio7;



public class Heroe {

    //atributos

    private String nombre;
    private int vida;
    private int ataque;




    //constructores

    public Heroe(){
        this.vida=100;
        this.vida = 100;
        this.ataque = 10;

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

    public void recibirDaño(int daño){

        this.vida = this.vida - daño;
        if (this.vida < 0) {//condicional para mantener el valor de vida por encima de-1
            this.vida = 0;
        }

    

    }

    public void mostrarInf(){

        System.out.println("Heroe: " +getNombre()+ " y su ataque es de : "+getAtaque());
        System.out.println("La vida del heroe es : "+getVida());


    }

    


    



    
}
