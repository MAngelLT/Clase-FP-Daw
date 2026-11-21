package Relación_de_ejercicios.Ejercicio6;
enum Palo{Oros, Copas,Espadas,Bastos}


public class Carta {

    //atributo 
    private int valor;
    private Palo palo;

    //Constructor por defecto
    public Carta(){
        this.valor = 1;
        this.palo = Palo.Espadas;

    }

    //Constructor por parámetros

    public  Carta(int valor, Palo palo ){
        this.valor=valor;
        this.palo=palo;

    }

    //Constructor copia

    public Carta( Carta otraCarta){

        this.valor=otraCarta.valor;
        this.palo=otraCarta.palo;

    }
    //getters y setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }


    public void imprimeCarta(){
        
        System.out.println("La carta vale: "+this.valor+" de "+ this.palo);

    }


    


    



    
}
