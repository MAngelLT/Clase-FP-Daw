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
    public Racional(){
 
    }


    //métodos
    public void asignaNumerador(int x){
        this.numerador=x;


    }
    
    public void asignaDenominador(int y){

        this.denominador=y;
        
     

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

    public void imprimirSuma( Racional r){
        



    }
    public int mcm(int num1,int num2){
        
        return num1* num2;
        // buscar  mcm
    }

    public void imprimirResta(){

    }

    public void imprimirProducto(){
        
    }

    public void imprimirDivision(Racional r){
        int num= this.numerador*r.getNumerador();
        int dem= this.denominador*r.getDenominador();
        
    }

    public static void main(String[] args) {


        Racional uno=new Racional();
        uno.setNumerador(4);
        uno.setDenominador(2);

        Racional dos=new Racional();
        dos.setNumerador(9);
        dos.setDenominador(3);
        
        
    }





    
}
