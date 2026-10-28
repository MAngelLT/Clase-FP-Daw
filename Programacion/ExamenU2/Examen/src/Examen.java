import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Examen {



    public static void precioEntradas(){
        int dia;
        int num_entradas;
        boolean tarjeta_cine = false;
        double precioBase =8; //le doy el valor de la entrad con el precio base
        int eleccion;
        double descuento =0;
        
        double total;
        double tiene_Pagar;
        
        //Pid los valores de ciertas variables al usuario
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingresa el número de entradas");
        num_entradas = sc.nextInt();sc.nextLine();

        System.out.println("Ingresa el día");
        System.out.println("1.Lunes, 2.Martes, 3.Miercoles, 4.Jueves, 5.Viernes, 6.Sabado, 7.Domingo");
        dia = sc.nextInt();sc.nextLine();
        if (dia == 3 )
            precioBase=5; //precio del dia del espectador
        else if(dia ==4 && num_entradas== 2)
            precioBase= 11; //Entrada para dos
            
        
        
        System.out.println("¿Tines tarjeta de CineCampa? 1.Sí 2.No");
        eleccion = sc.nextInt();sc.nextLine();
        if (eleccion==1){
            tarjeta_cine=true;
        
        }
        else{
            tarjeta_cine=false;
        }

        
        total=num_entradas*precioBase;

        descuento= total*0.10;
        tiene_Pagar=total*descuento;
        
        

        System.out.println("Venta de entradas CineCampa ");
        System.out.println("Número de entradas : "+ num_entradas);
        System.out.println("Día de la semana: " );
        System.out.println("¿Tiene tarjeta Campa? "+ tarjeta_cine);
        System.out.println("Aquí tiene sus entradas. Gracias por su compra");
        System.out.println("Entradas individuales: " + num_entradas);
        System.out.println("Precio por entrada individual " + precioBase+" Euros");
        System.out.println("Total "+total);
        System.out.println("Descuento "+descuento+" Euros");
        System.out.println("A pagar " + tiene_Pagar+"Euros");




        
    }

    //Actividad 2

    // public static int eleccion_aleatoria(){

    // }


    public static void juego(){

        Scanner sc=new Scanner(System.in);

        int eleccion_usu;
        int max=3,min=1;
        int eleccion_aleatoria=(int)(Math.random())*(max-min+1)+min;
        int win_ia=0;
        int win_usu;


        

        System.out.println("Juego : Piedra , Papel, Tijera");
        System.out.println("Elige 1.Piedra, 2.Papel, 3.Tijera");

        eleccion_usu=sc.nextInt();sc.nextLine();
        while (eleccion_usu!= -1|| win_ia ==5){


        }

    

        


        // double aleatorio=(int)(Math.random()*(max-min+1)+min);

    }

    public static void numeros(){

        //Actividad 3

        Scanner sc=new Scanner(System.in);

        int num_usu;
        int contador=0;
        int suma =0;
        int suma_imp=0;
        int mayor_par_posi=0;
        int menor_neg=0;

        System.out.println("Ingresa un numero poitivo o negativo. termina con 0");
        num_usu=sc.nextInt();sc.nextLine();
        

        while (num_usu != 0){
            System.out.println("Ingresa un número");
            num_usu=sc.nextInt();sc.nextLine();
            contador++;
            suma= suma+num_usu;

            if (num_usu%2!=0){
                suma_imp=suma_imp+num_usu;

            }

            if(num_usu%2==0){ // busco  el numero introducido que sea par 
                
                if(mayor_par_posi>num_usu){ //Busco los numeros pares mayores que mayor_par_posi(0)
                    
                    mayor_par_posi=mayor_par_posi;

                }
                else{
                    mayor_par_posi=num_usu;
                }
            }

            if (num_usu>menor_neg){  //Usamos el condicional if para buscar el menor numero negativo
                menor_neg=menor_neg;
            }
            else{
                menor_neg=num_usu;
            }

             
        }

        System.out.println("Se han ingresado "+ contador+" números");
        System.out.println("La suma de los números impares es : "+ suma_imp);
        System.out.println("El mayor de los pares positivos es : "+ mayor_par_posi);
        System.out.println("El menor de los negativos es : "+ menor_neg);



    }

    public static void imprimeTablero(boolean elige){
        //Actividad 4

        if(elige==true){
            System.out.println("x");
            System.out.println("o x");
            System.out.println("x o o");
            System.out.println("x o x o x o x");
            System.out.println("0 1 2 3 4 5 6");


        }
        else{
            System.out.println("x o x");
            System.out.println(" o ");
            System.out.println(" x");
            System.out.println("0 1 2 ");

        }
     
        
    }

    // public static void contarPositivos(){
        //Actividad 5
    //     Scanner sc=new Scanner(System.in);

    //     int num_usu;

    //     while (num_usu != 0){
    //         System.out.println("Ingresa un número");
    //         num_usu=sc.nextInt();sc.nextLine();

    // }




    public static void main(String[] args) {

        // numeros();
        // imprimeTablero(false);

        
        
    }
    
}
