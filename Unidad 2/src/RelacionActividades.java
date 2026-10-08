import java.time.LocalDateTime;
import java.util.Scanner;

public class RelacionActividades {


    public static void saludo(){
        //guardamos la hora local dentro de una variable
        LocalDateTime fecha = LocalDateTime.now();
        int hora=fecha.getHour();
        
        

        if(hora>=6 && hora<= 12){
            System.out.println("Buenos Dias");

        }
        else if(hora>12 && hora<20){
            System.out.println("Buenas tardes");
        }
        
        else {
            System.out.println("Buenas Noches");
        }

    }

    public static void salariosemanal(){
        Scanner sc=new Scanner(System.in);
        //definimos las variables
        int horas,salario,salarioplus;
        double dineroARecibir;
        salario=12;
        salarioplus=16;

        //Guardamos las horas trabajadas del usuario en una variable
        System.out.println("Ingresa tus horas trabajadas: ");
        horas = sc.nextInt(); sc.nextLine();

        if(horas<=40){
            dineroARecibir =horas * salario;
            System.out.println("Tu salario es: "+dineroARecibir);
        }
        else{
            dineroARecibir= horas*salarioplus;
            System.out.println("Tu salario es: "+dineroARecibir+" Euros");
        }



    
    }

    public static void SignoDelZodiaco(){
        //Definos las variables que introducira el usuario
        int dia,mes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa tu dia  de nacimiento: ");
        dia = sc.nextInt(); sc.nextLine();

        System.out.println("Ingresa tu mes de nacimiento: ");
        mes = sc.nextInt(); sc.nextLine();

        

        //Usamos la condicinal para distribuir los meses con el signo Zodiacal
        
        if (dia>31 && mes>12){
            System.out.println("Tienes que ingresar una fecha válida");
        }
        else{
            if ((dia>=21 && mes ==3 )||(dia<=19 && mes== 4 )){
                System.out.println("Tu signo zodiacal es Aries" );
            }
            
            else if ((dia>=20 && mes ==4 )||(dia<=20 && mes== 5 )){
                System.out.println("Tu signo zodiacal es Tauro" );
            }
             else if ((dia>=21 && mes ==5 )||(dia<=20 && mes== 6 )){
                System.out.println("Tu signo zodiacal es Géminis" );
            }
             else if ((dia>=21 && mes ==6 )||(dia<=22 && mes== 7 )){
                System.out.println("Tu signo zodiacal es Cáncer" );
            }
             else if ((dia>=23 && mes ==7 )||(dia<=22 && mes== 8 )){
                System.out.println("Tu signo zodiacal es Leo" );
            }
             else if ((dia>=23 && mes ==8 )||(dia<=22 && mes== 9 )){
                System.out.println("Tu signo zodiacal es Virgo" );
            }
             else if ((dia>=23 && mes ==9 )||(dia<=22 && mes== 10 )){
                System.out.println("Tu signo zodiacal es Libra" );
            }
             else if ((dia>=23 && mes ==10 )||(dia<=21 && mes== 11 )){
                System.out.println("Tu signo zodiacal es Escorpio" );
            }
             else if ((dia>=22 && mes ==11 )||(dia<=21 && mes== 12 )){
                System.out.println("Tu signo zodiacal es Sagitario" );
            }
             else if ((dia>=22 && mes ==12 )||(dia<=19 && mes== 1 )){
                System.out.println("Tu signo zodiacal es Capricornio" );
            }
            else if ((dia>=20 && mes ==1 )||(dia<=18 && mes== 2 )){
                System.out.println("Tu signo zodiacal es Acuario" );
            }
            else if ((dia>=19 && mes ==2 )||(dia<=20 && mes== 3 )){
                System.out.println("Tu signo zodiacal es Piscis" );
            }
           else{
            System.out.print("El mes que has introducido no tiene esa cantidad de dias");
           }
        }

    }

    public static void NotaDeTrimestre(){

        // falta añadirlo en un bucle, el programa sigue despues de saber que esta mal, sino en Cond anidados.
        double nota1, nota2, media, medianueva, recuperacion;

        Scanner sc=new Scanner(System.in);

        //Pedimos al usuario las notas / Usamos una entrada double para posibles decimales
        
        System.out.println("Ingresa tu primera nota");
        nota1=sc.nextDouble(); sc.nextLine();
        if (nota1>10 || nota1 <0){
            System.out.println("La nota introducida no es valida");
        }

        System.out.println("Ingresa tu segunda nota");
        nota2=sc.nextDouble(); sc.nextLine();
        if (nota2>10 || nota2 <0){
            System.out.println("La nota introducida no es valida");
        }

       media = (nota1 + nota2) / 2;
       
       if (media >= 5){

        System.out.println("Estas aprobado");
       }
       else {
        System.out.println("No has aprobado, tienes que hacer el examen de recuperación.");
       }

       System.out.println("¿Cual es el resultado de la recuperación?");

       recuperacion = sc.nextDouble(); sc.nextLine();
        if (recuperacion>10 || recuperacion <0){
            System.out.println("La nota introducida no es valida");
        }
        else if(recuperacion >= 5){
            
            medianueva = 5;
            System.out.println("Apto, tu nota final es: "+ medianueva);
        }
        else{
            System.out.println("No Apto, tu nota final es. "+media);
            
        }

        




    }

    public static void horario(){
        int eleccion;
        System.out.println("Elige el dia la semana para ver el horario de ese día");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Ver horario Completo");
        System.out.println("7. Salir");
        Scanner sc=new Scanner(System.in);
        eleccion = sc.nextInt();sc.nextLine();

        //Añadimos un bucle para que no se cierre el sistema sin que lo elija el usuario
        while (eleccion != 7){




            if (eleccion == 1){
                System.out.println("El horario del Lunes es:");
                

            }
            else if(eleccion ==2){
                System.out.println("El horario del Martes es:");
                break;

            }
            else if(eleccion ==3){
                System.out.println("El horario del Miercoles es:");
                break;
                
            }
            else if(eleccion ==4){
                System.out.println("El horario del Jueves es:");
                break;
                
            }
            else if(eleccion ==5){
                System.out.println("El horario del Viernes es:");
                break;
                
            }
            else if(eleccion ==6){
                System.out.println("El horario de la semana es:");
                break;
                
            }
            else {
                System.out.println("Ingresa una opcion disponible");

                        System.out.println("Elige el dia la semana para ver el horario de ese día");
                        System.out.println("1. Lunes");
                        System.out.println("2. Martes");
                        System.out.println("3. Miercoles");
                        System.out.println("4. Jueves");
                        System.out.println("5. Viernes");
                        System.out.println("6. Ver horario Completo");
                        System.out.println("7. Salir");
                        eleccion = sc.nextInt();sc.nextLine();

                
            }
                System.out.println("Elige el dia la semana para ver el horario de ese día");
                System.out.println("1. Lunes");
                System.out.println("2. Martes");
                System.out.println("3. Miercoles");
                System.out.println("4. Jueves");
                System.out.println("5. Viernes");
                System.out.println("6. Ver horario Completo");
                System.out.println("7. Salir");


        }
        System.out.println("Hasta Pronto");


    }

    public static void main(String[] args) {

        // saludo();

        // salariosemanal();
        // SignoDelZodiaco();
        // NotaDeTrimestre();
        horario();
    
    }
    
}
