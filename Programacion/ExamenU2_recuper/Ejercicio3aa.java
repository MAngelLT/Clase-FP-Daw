package ExamenU2_recuper;

import java.util.Scanner;

public class Ejercicio3aa {

    public static void main(String[] args) {
        contarNumeros();
        

        
    }
    
    public static void contarNumeros(){

        Scanner leer=new Scanner(System.in);
        int sumaImp =0;
        int mediaParPosi=0;
        int sumaParPosi=0;
        int contador=0;
        int menorNeg=0;
        int contador_par_posi=0;

        
        System.out.println("Ingresa números y se detiene ingresando 0");

        int num_usu=leer.nextInt();leer.nextLine();//se ingresa los numeros en la variable

        while(num_usu!=0){
            System.out.print("Ingresa el siguiente número: ");
            num_usu=leer.nextInt();leer.nextLine();
            contador++;

            if(num_usu%2==0){
                //pares
                if(num_usu>0){
                    //pares positivos
                    contador_par_posi++;
                    sumaParPosi=sumaParPosi+num_usu;
                }

            }else{
                //impares
                if(num_usu%3 ==0 && num_usu%5==0){
                    //impares multiplo de 3 y5
                    sumaImp=sumaImp+num_usu;
                }
            }
            if(num_usu<0){
                //negativos
                if(num_usu<menorNeg){
                    menorNeg=num_usu;
                }
            }
        }

        mediaParPosi=sumaParPosi/contador_par_posi;


        System.out.println("Se han introducido "+contador+" números");
        System.out.println("La suma de impares multiplo de 3 y 5 es: " + sumaImp);
        System.out.println("la media de los num pares positivos es: "+mediaParPosi);
        System.out.println("El menor de los números negat es: "+menorNeg);



        
    }
}
