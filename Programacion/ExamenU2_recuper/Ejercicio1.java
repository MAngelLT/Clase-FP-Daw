package ExamenU2_recuper;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        precioEntradas();
    }

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
        else if(dia ==4 && num_entradas>= 2){

            precioBase= 11; //Entrada para dos los Jueves
            
        }
        
        System.out.println("¿Tines tarjeta de CineCampa? 1.Sí 2.No");
        eleccion = sc.nextInt();sc.nextLine();
        if (eleccion==1){
            tarjeta_cine=true;
        
        }
        else if(eleccion==2){
            tarjeta_cine=false;
        }

        
        total=num_entradas*precioBase;

        descuento= total*0.10;
        tiene_Pagar=total-descuento;
        
        

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
    
}
