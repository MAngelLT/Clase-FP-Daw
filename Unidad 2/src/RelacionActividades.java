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

    public static void Horario(){
        int eleccion;
        System.out.println("Elige una opción para ver el horario de ese día");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Ver horario Completo");
        System.out.println("7. Salir");
        Scanner sc=new Scanner(System.in);
        System.out.print("Opcion =");
        eleccion = sc.nextInt();sc.nextLine();
        System.out.println("---------------------------------------");

        //Añadimos un bucle para que no se cierre el sistema sin que lo elija el usuario
        while (eleccion != 7){




            if (eleccion == 1){
                System.out.println("El horario del Lunes es:");
                System.out.println("---------------------------------------");
                

            }
            else if(eleccion ==2){
                System.out.println("El horario del Martes es:");
                System.out.println("---------------------------------------");
                

            }
            else if(eleccion ==3){
                System.out.println("El horario del Miercoles es:");
                System.out.println("---------------------------------------");
                
                
            }
            else if(eleccion ==4){
                System.out.println("El horario del Jueves es:");
                System.out.println("---------------------------------------");
                
                
            }
            else if(eleccion ==5){
                System.out.println("El horario del Viernes es:");
                System.out.println("---------------------------------------");
                
                
            }
            else if(eleccion ==6){
                System.out.println("El horario de la semana es:");
                System.out.println("---------------------------------------");
                
                
            }
            else {
                System.out.println("Opción no disponible.Ingresa uno de los siguientes valores");

                         System.out.println("---------------------------------------");
                        System.out.println("Elige el dia la semana para ver el horario de ese día");
                        System.out.println("1. Lunes");
                        System.out.println("2. Martes");
                        System.out.println("3. Miercoles");
                        System.out.println("4. Jueves");
                        System.out.println("5. Viernes");
                        System.out.println("6. Ver horario Completo");
                        System.out.println("7. Salir");
                        System.out.print("Opcion =");
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
                System.out.println("---------------------------------------");
                System.out.print("Opcion =");
                eleccion = sc.nextInt();sc.nextLine();


        }
        System.out.println("Hasta Pronto");


    }

    public static void nomina(){

        //Declaro varibles
        double nomina,sueldo_base,sueldo_b,sueldo_n,IRPF,dieta, retencionIRPF;
        sueldo_base =0;
        int cargo_empleado, estado_civil,dias_viaje;
        Scanner sc=new Scanner(System.in);

        //Solicito los datos del cargo

        System.out.println("Ingresa tu cargo");
        System.out.println("1.Prog. junior");
        System.out.println("2.Prog. senior");
        System.out.println("3.Jefe de proyecto");
        System.out.print("= ");
        cargo_empleado= sc.nextInt(); sc.nextLine();

        //Solicito los días visitando clientes
        System.out.println("¿Cuántos dias has estado de viaje visitando clientes?");
        System.out.print("= ");
        dias_viaje = sc.nextInt(); sc.nextLine();

        //Estado civil del usuario
        System.out.println("Introduzca su estado civil (1-Soltero, 2-Casado):");
        System.out.print("= ");
        estado_civil = sc.nextInt(); sc.nextLine();

        //Sueldo segun el cargo
        if (cargo_empleado == 1){
            sueldo_base = 950;
        }
        else if (cargo_empleado == 2){
            sueldo_base= 1200;

        }
        else if (cargo_empleado == 3){
            sueldo_base= 1600;

        }
        
        dieta= dias_viaje*30;
        sueldo_b = sueldo_base + dieta;
      
        // Impuesto sobre la Renta de Personas Físicas

        if (estado_civil == 1){
            IRPF= 0.25;  
        }
        else{
            IRPF= 0.20;
        }
        
        //Retención de IRPF
        retencionIRPF= sueldo_b * IRPF;
        sueldo_n = sueldo_b - retencionIRPF;  //Sueldo neto

        System.out.println("-------------------------");
        System.out.println("Sueldo base         "+sueldo_base);
        System.out.println("Dietas ("+dias_viaje+" viajes)      "+ dieta);
        System.out.println("-------------------------");
        System.out.println("Sueldo bruto         " + sueldo_b);
        System.out.println("Retención IRPF        "+ retencionIRPF);
        System.out.println("-------------------------");
        System.out.println("Sueldo neto         "+sueldo_n);
        System.out.println("-------------------------");
  
    }

    public  static void ejercicio7(){

        int numero;
        int numero_positivos,cont_posit=0,cont_neg=0,cont_sietes=0,cont_numeros=0;
        double media=0,sumatotal=0;

        //Pedimos el primer numero al usuario
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número entero (0 para salir)");
        numero = sc.nextInt(); sc.nextLine();

        while (numero !=0) {

            // Comprobamos si es positivo o negativo
            if (numero >0){
                cont_posit++;
            }
            else{
                cont_neg ++;
            }

            // Comprobamos los sietes
            if(numero==7 || numero == -7){
                cont_sietes ++;
            }

            // Contadores para la media

            sumatotal = sumatotal + numero;
            cont_numeros ++;

            System.out.println("Ingresa un número entero (0 para salir)");
            numero = sc.nextInt(); sc.nextLine();


            
        }

        media = sumatotal/cont_numeros;
        System.out.println("Números positivos ingresados son : "+cont_posit);
        System.out.println("Números negaticos ingresados son : "+cont_neg);
        System.out.println("La media es: "+ media);
        System.out.println("El número 7 o -7  se han repetido "+cont_sietes+" veces.");


    }

    public static void serieFibonacci(){
        int num_limite;
        int resultado=0,digito2=1;
        int siguiente;

        //le pedimos al usuario que ingrese el numero limite de la serie.
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el numero hasta donde se detiene la serie(mayor que 0)");
        num_limite = sc.nextInt();sc.nextLine();

        //
        System.out.print("La serie Fibonacci es: ");
        for (int i=0; i<=num_limite;i++){
            System.out.print(resultado+", ");
            siguiente= resultado+digito2; 
            resultado=digito2;
            digito2= siguiente;

        }


    }

    public static void numerosPrimos1_100(){

        Scanner sc=new Scanner(System.in);
        int num_usu;
        System.out.print("Ingresa un numero del 1 al 100 para verificar si es primo: ");
        num_usu=sc.nextInt();sc.nextLine();

        boolean primo= true;
        if (num_usu<=1){
            primo=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num_usu);i++){
                if (num_usu % i==0){
                    primo=false;
                    break;
                }

            }
            if (primo==true){
                System.out.println("Es primo");
            }
            else{
                System.out.println("No es primo");
            }
        }
        


    }

    public static void pares_e_impares_en_un_numero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número para saber cuantos  pares e impares tiene ");
        int num_usu,pares,impares;
        num_usu=sc.nextInt();sc.nextLine();

        impares = contarImpares(num_usu);
        pares = contarPares(num_usu);

        System.out.println("El numero "+num_usu+" tiene "+pares+" pares y "+impares+" impares.");



    }
    
    public static int contarPares(int num_usu){//función para contar los pares
        int contador=0;
        if (num_usu==0){
            return 1;
        }
        while(num_usu>0){
            int digito= num_usu%10; //ingresamos el valor del ultimo digito 
            if(digito% 2==0){
                contador++; //si es par añadimos 1 al contador
            }
            num_usu=num_usu/10; //dividimos para eliminar el ultimo digito
        }
        return contador; //regresa la cantidad de num pares
    }

    public static int contarImpares(int num_usu){
        int contador =0;
        while(num_usu>0){
            int digito =num_usu %10 ;
            if (digito%2 !=0){
                contador++;
            }
            num_usu=num_usu/10;
        }
        return contador;
    }






    public static void main(String[] args) {

        // saludo(); //actividad 1

        // salariosemanal(); //actividad 2
        //SignoDelZodiaco(); //actividad 3
        // NotaDeTrimestre(); //actividad 4
        //Horario(); //actividad 5
        //nomina(); //actividad 6
        //ejercicio7(); //actividad 7
        //serieFibonacci(); //actividad 8
        // numerosPrimos1_100(); //actividad 9
        // pares_e_impares_en_un_numero(); //actividad 10
        


    
    }
    
}
