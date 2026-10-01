import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {


     //Actividad 1, diapositiva 9


        //Generar 2 números de manera aleatoria
        // int max=26;
        // int min = 1;
        // double aleatorio=(int)(Math.random()*(max-min+1)+min);
        // double aleatorio2=(int)(Math.random()*(max-min+1)+min);
        // //Realizar las operaciones
        // System.out.println("El primer número es: "+ aleatorio);
        // System.out.println("El segundo número es: "+ aleatorio2);
        // // System.out.println(Math.divideExact(aleatorio, aleatorio2));
        // System.out.println("El cociente es: " +(aleatorio/aleatorio2));
        // System.out.println("La media es: " +((aleatorio+aleatorio2)/2));
        // System.out.println("La potencia es : " +(Math.pow(aleatorio, aleatorio2)));
        // System.out.println("La raiz cuadrada del primer numero es: " +(Math.sqrt(aleatorio)));
        // System.out.println("La raiz cuadrada del segundo numero es: " +(Math.cbrt(aleatorio)));
    

        // Actividad 2¿Como sabemos si un número es divisible por 2 y por 3?

        // int digito= 4;
        // if (digito %2 == 0 && digito %3 == 0){
        //     System.out.println("El numero es divisible por dos y por 3");
        // }
        // else{
        //     System.out.println("No es divisible para 2 y 3");

        // }

    
        //*Actividad 3  30/09/2026


        Scanner sc=new Scanner(System.in);
        // double numeroa;
        // double numerob;
        // double numeroc;
        // double formula2do,x1,x2;

        // System.out.println("Ingresa el valor de a: ");
        // numeroa=Integer.parseInt(sc.nextLine());
        // //numeroa=sc.nextInt(); 
        // // numeroa=Integer.parseInt(sc.nextLine());
        // System.out.println("Ingresa el valor de b: ");
        // //numerob=sc.nextInt(); 
        // numerob=Integer.parseInt(sc.nextLine());
        // System.out.println("Ingresa el valor de c: ");
        // //numeroc=sc.nextInt(); 
        // numeroc=Integer.parseInt(sc.nextLine());

        // formula2do =((Math.pow(numerob,numerob))-(4*numeroa*numeroc));
        // if (formula2do < 0){
        //     System.out.println("No hay solciones");
        // }
        // else if (formula2do==0){
        //     x1=-numerob/(2.0*numeroa);
        //     System.out.println("La unica slución es: "+ x1);

        // }
        // else{
        //     x1=(-numerob + Math.sqrt(formula2do)/(2.0*numeroa));
        //     x2=(-numerob - Math.sqrt(formula2do)/(2.0*numeroa));
        //     System.out.println("La primera solución es :"+ x1);
        //     System.out.println("La segunda solución es :"+ x2);
        // }
        






        //Actividad 2 

        // int nota;
        // System.out.println("Ingrese la nota");
        // nota=Integer.parseInt(sc.nextLine());
        
        // if (nota < 5){
        //     System.out.println("Suspenso");
        // }
        // else if (nota < 7 ){
        //     System.out.println("Aprobado");
        // }
        // else if (nota < 9 ){
        //     System.out.println("Notable");
        // }
        // else if (nota > 9 ){
        //     System.out.println("Sobresaliente");
        // }


        //Con Switch

        //  switch(nota){
        //         case 0,1,2,3,4:System.out.println("Suspenso");
        //         case 5,6,7,8:System.out.println("Notable");
        //         case 9,10:System.out.println("Sobresaliente");
        //         break 
        //         d
        //  }


        // int month,day,year;
        // System.out.println("Escribe el día :");
        // day=Integer.parseInt(sc.nextLine());
        // if (day >0 && day <=31){
        //     System.out.println("Escribe el mes");
        //      month=Integer.parseInt(sc.nextLine());

        //         if (month<=12 && month>0){

        //             System.out.print("Escribe el año: ");
        //             year=Integer.parseInt(sc.nextLine());

        //             if ((year % 4 ==0 && year % 100 != 0)||(year % 400 == 0)){
        //                 System.out.println("El "+day+"/"+month+"/"+year+ ".Es bisiesto ");
        //             }
        //             else{
        //                 System.out.println("La fecha " + day + "/" + month + "/" + year +"No es bisiesto");
        //             }
                    
        //         }
        //     else{
        //         System.out.println("El mes no es correcto");
        //     }
        // }
        // else{
        //      System.out.println("El día no existe");
            
        //}


        // //hecho junto los messes dias y años

        // int dia, mes, anio;

        // System.out.println("Introduce el día, mes y año");
        // dia=sc.nextInt();
        // mes=sc.nextInt();
        // anio=sc.nextInt(); sc.nextLine();


        // }



        //Actividad Bucles
        //Multiplos de 2 y 3 entre 50 y 200

        // for(int i=50, i<=200;i++)


        //Actividad 2


        int num;
        int producto=1;
        num=sc.nextInt();
        if (num <=0){

            System.out.println("Los factoriales no pueden se negativos");

        }
        else{
            for(int i=1; i>=num;i--){
                producto=producto*i;
            }
            System.out.println("El factorial del"+num+"es:"+ producto);
        }

        





    }   

}