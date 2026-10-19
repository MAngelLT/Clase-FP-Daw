import java.time.LocalDateTime;
import java.util.Scanner;

import utilidades.matematicas;

public class Unidad2 {
    /**
     * @autor Miguel Lapo Tuarez
     * @version 1.0
     * @param args
     * 
     * Unidad 2: Fudamentos de la programacion
     */
    public static void main(String[] args) {
        // int classes;
        // String caracter = "Miguel";
        // System.out.println("Hello World");
        //System.out.println((1+2+3+1)/3);
        //System.out.println((1+2+3+1)/3.0);
       //int []b={4,0,-1};
        //System.out.println(b[2]);

        //final int VALOR = 3;  // (final)Variable que en el momento que se le asigne un valor ya no se puede cambiar
        // Buena Practica dejar las Constante en matusculas para distinguirlas
         //short num = 4;


         // Las variables tienen que llevar un valor , si no arrastras código basura

        // int uno=1,dos=2,tres=3;
         //Declarar varias variables en una linea

        //  /*
        //  Este parrafo es un comentario
        //  asdasdf
        //  asd
        //  asdasdasf
        //  asd */

        // //Clase 2

        // // Ejemplo de introducir un valor por teclado
        // Scanner sc=new Scanner(System.in);
        // int numero;
        // System.out.println("Introduce un número entre 5 y 25");
        // numero=sc.nextInt(); 
        // System.out.println("El número introducido es:  " + numero);
        // sc.nextLine(); 
        // System.out.println("Introduce tu nombre: ");
        // String nombre=sc.nextLine();
        // System.out.println("Tu nombre es: " +nombre);
        //Nextline lee todo lo que ingreses, mejor usarlo al final
        //nex para leer de un en uno

//      LocalDateTime hoy = LocalDateTime.now();
//  System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
//  System.out.println("El día es: " + hoy.getDayOfMonth());
//  System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
//  System.out.println("El año es: " + hoy.getYear());
//  System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());
//  System.out.println(Math.pow(2,5));

//  int max=26;
//  int min = 0;
//  char letra='a';
//  double aleatorio=(int)(Math.random()*(max-min+1)+min);
//  System.out.println((char)letra+aleatorio);
  



    //Clase 3
//Utilizar las fuciones sumar y restar de la clase Matematicas


// int numero1= 3;
// int numero2=5;
// System.out.println("La suma es: "+ matematicas.sumar(numero1,numero2));
// System.out.println("La multiplicación es: "+ matematicas.multiplicar(numero1,numero2));
//  System.out.println("El resto de la division 5/2 es : "+ (5%2));
//  int variable = 2;
//  variable++; // variable = variable + 1 
//  System.out.println("La variable vale: "+ variable );
//   int a = 5;
//   int b = a++;
//  variable++; // variable = variable + 1 
//  System.out.println("La b vale: "+ b );

    //Condiciones IF/ELSE
    // int numero=3;
    // int numero2=5;
    // int resultado;
    // if (numero > numero2){
    //     // //Si ocurre hara esto
    //     resultado=numero+numero2;

    // }
    // else{
    //     //Si no se cumple hara esto
    //     resultado = numero -numero2;
    //     System.out.println("NO era mayor")
    // }

    // System.out.println(numero+" "+numero2+" "+resultado );
    // //Usando el operador ternario
    // resultado=(numero>numero2) ? numero+numero:numero-numero2;
    // System.out.println(numero+" "+numero2+" "+resultado );
    // System.out.println("Por AQUI VOY");

    // //Saber el día de la semana
    // //IF /ELSe encadenado

    // int dia = 1;

    // if (dia == 1){
    //     System.out.println("Hoy es Lunes");  
    // }
    // else if (dia == 2 ){
    //     System.out.println("Hoy es Martes");
    // }
    // else if (dia == 3 ){
    //     System.out.println("Hoy es Miercoles");
    // }
    // else if (dia == 4 ){
    //     System.out.println("Hoy es Jueves");
    // }
    // else if (dia == 5 ){
    //     System.out.println("Hoy es Viernes");
    // }
    // else if (dia == 6 ){
    //     System.out.println("Hoy es Sabado");
    // }
    // else {
    //     System.out.println("Hoy es Domingo");
    // }
    
    // //SWITCH

    // int valor=4;
    // switch (valor){

        
    // }

    //Clase 4: Bucles
    //Estructuras: FOR
    // for(int i=0; i<=5;i++){        //1Desdedonde ;2Hasta donde ;3de cuanto en cuanto
    //     System.out.println(i);
    // }


    //Estructura WHILE
    // ctrl + c para detener un bucle infinito.
    // int i=0;
    // while (i<=5){
    //     System.out.println(i);
    //     i++;
    // }


    // //Estrucutura DO-WHILE (Haz mientras se cumpla la condición)
    // int i = 0;
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<=5);

    
    //CLase 5: Bucles anidados y 

    // for (int i=1; i<=4; i++){
    //     if (i%2 == 0 ){  //Mostrar solo las filas pares
    //         for(int j=i; j<=4; j++){
    //         System.out.print("*");

    //         }
    //     }
    //     System.out.println();
    //     }




        // for (int i=1; i<= 10 ; i++){  falta revisar y arreglar
        //     for(int j=1; j<= 10; j++){

        //        System.out.print(i+"*"+j+"= "+ (i*j));
        //     }

        // }



    
        //CLASE 6 :Recursividad

        // System.out.println("El factorial vale: "+calcularFactorial(3));

        // int a = 254;
        // System.out.println(funcion(a, 2));
        // incre(4);
        // SumaHastaN(5);
        // System.out.println(potenciaN(3, 3));

        // int edad = -5;
        // assert edad >= 0 : "Edad incorrecta";
        // System.out.println("Fin");


        //Atender excepciones


        // double resultado = dividir(10, 0);
        // System.out.println(resultado);


        //Depuración del programa

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Elemento en posición 2: " + numeros[2]);
        System.out.println("Elemento en posición 4: " + numeros[4]);

        

    }
    
    public static int funcion(int num, int pos){
        if(num < 10){
        return num;
        }else{
        return  (funcion(num/10, pos-1))+ (int) Math.pow(10, pos) *(num % 10) ;}
        }

    public static int calcularFactorial(int n){
        //Caso base : el factorial de 0 es 1
        if ( n==1) return 1;
        else{
            return n*calcularFactorial(n-1);
        }

    }


    public static void incre(int n){
        if(n>0){
            
            System.out.print(n);
            incre(n-1);
        }
        else{
            System.out.println();
        }
        //Pilas de llmada para n=4
        /// n=4 
    }

    public static  int SumaHastaN(int n){

        //Enfoque iterativo
        // int suma= 0;
        // for(int i=0;i<=n;i++){
        //     suma=suma+i;
        // }
        // return suma;

        //enfoque recursivo

        //Caso base
        // if(n==1){ return 1;}
        // else{//Caso recursivo
        //     return n + SumaHastaN(1-n);
        // }

               
      

    }




    public static int potenciaN(int n, int potencia){
        if (n== (n*potencia)){return (n*potencia);} // 

        else 
        { return n*potenciaN(n, potencia-1) ;  }


    }




    public static double dividir(double numerador,double denominador) throws Exception{

        return numerador/denominador;
        
    }

    
}

