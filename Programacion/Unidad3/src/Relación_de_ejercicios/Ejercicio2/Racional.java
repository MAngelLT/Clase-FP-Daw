package Relación_de_ejercicios.Ejercicio2;

public class Racional {
    //atributos
    private int numerador;
    private int denominador;
    // private int producto;

    //setters y getters
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //constructor
    public Racional(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }


    //métodos
    public void asignaNumerador(int x){
        numerador=x;
        


    }
    
    public void asignaDenominador(int y){

        denominador=y;
        
     

    }
    public void imprimirRacional(){
        try{
            double division= numerador/denominador;

            System.out.println("El número racional es: "+division);
        }catch(ArithmeticException e){
            System.out.println("estas dividiendo por 0!!!!");
        }

        System.out.println("el numerador es "+this.numerador);
        System.out.println("El denominador es "+this.denominador);

    }

    public void imprimirSuma(){


    }

    public void imprimirResta(){

    }

    public void imprimirProducto(){
        
    }

    public void imprimirDivision(){
        
    }

    public static void main(String[] args) {
        Racional op1=new Racional(14, 2);

        op1.imprimirRacional();
        
    }





    
}
