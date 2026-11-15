package Relación_de_ejercicios.Ejercicio2;

public class Racional {
    //atributos
    private int numerador;
    private int denominador;


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
        System.out.println("El númerador es "+ x);


    }
    
    public void asignaDenominador(int y){

        this.denominador=y;
        System.out.println("El númerador es "+ y);
        
     

    }
    public void imprimirRacional(){
       
        System.out.println("La fracción es: "+this.numerador+"/"+this.denominador);
        System.out.println("-----------------------------------------------------------");
        

    }
    public int calcularMcm(int num1, int num2) {// función para sacarl el mcm de las fracciones
        int mayor, mcm;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        
        mayor = Math.max(num1, num2);
        mcm = mayor;

        while(mcm % num1 != 0 || mcm % num2 != 0){
            mcm = mcm + mayor;
        }
        
        return mcm; 
    }

    public void imprimirSuma( Racional r){
        // buscamos el denominador comun usando la funcion calcularMcm
        int denominador_comun = calcularMcm(this.denominador, r.getDenominador());

        //usamos la formula de suma de fracciones 
        int numerador1 = (denominador_comun / this.denominador) * this.numerador;
        int numerador2 = (denominador_comun / r.getDenominador()) * r.getNumerador();
        int numFinal = numerador1 + numerador2; // sumamos los numeradores
        System.out.println("El resultado de la suma es: " + numFinal + "/" + denominador_comun);
    
        // resultado en decimal
        double decimal = (double) numFinal / denominador_comun;
        System.out.println("El resultado decimal es: " + decimal);
        System.out.println("-----------------------------------------------------------");
            



    }

    public void imprimirResta(Racional r){
        // buscamos el denominador comun usando la funcion calcularMcm
        int denominador_comun = calcularMcm(this.denominador, r.getDenominador());

        //usamos la formula de suma de fracciones 
        int numerador1 = (denominador_comun / this.denominador) * this.numerador;
        int numerador2 = (denominador_comun / r.getDenominador()) * r.getNumerador();
        int numFinal = numerador1 - numerador2; // restamos los numeradores
        System.out.println("El resultado de la resta es: " + numFinal + "/" + denominador_comun);
    
        // resultado en decimal
        double decimal = (double) numFinal / denominador_comun;
        System.out.println("El resultado decimal es: " + decimal);
        System.out.println("-----------------------------------------------------------");

    }

    public void imprimirProducto(Racional r){
        int num= this.numerador*r.getNumerador(); // para multiplicar fraciones se multiplica en linea  (numerador)
        int dem= this.denominador*r.getDenominador();// (denominador)
        
        System.out.println("La fracción resultante de la multiplicación es: "+num+"/"+dem);// imprime la fraccion resultante
        double producto=(double)num/dem;//cálculo para convertirse en decimal
        System.out.println("El resultado decimal es: "+producto); //resultado decimal
        System.out.println("-----------------------------------------------------------");
        
    }

    public void imprimirDivision(Racional r){
        int num= this.numerador*r.getDenominador(); // para dividir fraciones se multiplica en cruz (numerador)
        int dem= this.denominador*r.getNumerador();// (denominador)
         try{
            double division=(double) num/dem;// obligar a que de el resultado de la division en decimales

            System.out.println("El resultado de la división es:"+ num+"/"+dem);
            System.out.println("El resultado decimal de la division es: "+division);
            System.out.println("-----------------------------------------------------------");
        }catch(ArithmeticException e){
            System.out.println("Estas dividiendo por 0!!!!");
        }

        
    }

    public static void main(String[] args) {


        Racional uno=new Racional();//fracción 1
        uno.setNumerador(4);
        uno.setDenominador(2);

        Racional dos=new Racional(); //fracción 2
        dos.setNumerador(9);
        dos.setDenominador(3);

        uno.imprimirRacional();
        dos.imprimirRacional();
        uno.imprimirSuma(dos);
        uno.imprimirResta(dos);
        uno.imprimirProducto(dos);
        uno.imprimirDivision(dos);

        
        
    }





    
}
