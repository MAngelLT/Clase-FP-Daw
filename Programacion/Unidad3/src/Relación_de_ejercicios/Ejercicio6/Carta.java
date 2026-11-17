package Relación_de_ejercicios.Ejercicio6;
enum Palo{Oros, Copas,Espadas,Bastos}


public class Carta {

    //atributo 
    private int valor;

    private Palo palo;
    private int aleatorio;


    //Constructor por defecto
    public Carta(){

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


    public void Imprimecarta(){
        int max=12;int min=1;

        aleatorio=(int)(Math.random()*(max−min+1))+min);
        
        System.out.println("La carta vale: "+this.valor);
        System.out.println("La carta tine este palo: "+ this.palo);



    }


    


    



    
}
