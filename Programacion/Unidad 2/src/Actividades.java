import java.util.Scanner;

public class Actividades {


//Variable Globales
    final static double PI=3.14159;


    public static int maximo(int valor1, int valor2){ //Actividad 
         int maximo;
         if (valor1>=valor2){
             maximo=valor1;
         }
         else{
             maximo=valor2;
         }
         return maximo;
        
        }

    public static void actividad1(){

        //Generar 2 números de manera aleatoria
        int max=99;
        int min = 1;
        double aleatorio=(int)(Math.random()*(max-min+1)+min);
        double aleatorio2=(int)(Math.random()*(max-min+1)+min);
        //Realizar las operaciones
        System.out.println("El primer número es: "+ aleatorio);
        System.out.println("El segundo número es: "+ aleatorio2);
        System.out.println("El cociente es: " +(aleatorio/aleatorio2));
        System.out.println("La media es: " +((aleatorio+aleatorio2)/2));
        System.out.println("La potencia es : " +(Math.pow(aleatorio, aleatorio2)));
        System.out.println("La raiz cuadrada del primer numero es: " +(Math.sqrt(aleatorio)));
        System.out.println("La raiz cuadrada del segundo numero es: " +(Math.sqrt(aleatorio2)));
        
    }

    public static void actividad2(){

        
        // Actividad 2¿Como sabemos si un número es divisible por 2 y por 3?

        int digito= 4;
        if (digito %2 == 0 && digito %3 == 0){
            System.out.println("El numero es divisible por dos y por 3");
        }
        else{
            System.out.println("No es divisible para 2 y 3");

        }
    }

    public static void actividad3(){

        //Actividad 3 : Crear  un programa con el diagrama del flujo dado (Ecuación de segundo grado)
        Scanner sc=new Scanner(System.in);
        double numeroa;
        double numerob;
        double numeroc;
        double formula2do,x1,x2;

        System.out.println("Ingresa el valor de a: ");
        numeroa=Integer.parseInt(sc.nextLine());
        //numeroa=sc.nextInt(); 
        // numeroa=Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el valor de b: ");
        //numerob=sc.nextInt(); 
        numerob=Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el valor de c: ");
        //numeroc=sc.nextInt(); 
        numeroc=Integer.parseInt(sc.nextLine());

        formula2do =((Math.pow(numerob,numerob))-(4*numeroa*numeroc));
        if (formula2do < 0){
            System.out.println("No hay solciones");
        }
        else if (formula2do==0){
            x1=-numerob/(2.0*numeroa);
            System.out.println("La unica slución es: "+ x1);

        }
        else{
            x1=(-numerob + Math.sqrt(formula2do)/(2.0*numeroa));
            x2=(-numerob - Math.sqrt(formula2do)/(2.0*numeroa));
            System.out.println("La primera solución es :"+ x1);
            System.out.println("La segunda solución es :"+ x2);
        }
        

    }

    public static void actividad4(){
        //Actividad 4  programa que nos pide una nota y nos indica la calificación
        
        Scanner sc=new Scanner(System.in);

        int nota;
        System.out.println("Ingrese la nota");
        nota=Integer.parseInt(sc.nextLine());
        
        if (nota < 5){
            System.out.println("Suspenso");
        }
        else if (nota < 7 ){
            System.out.println("Aprobado");
        }
        else if (nota < 9 ){
            System.out.println("Notable");
        }
        else if (nota > 9 ){
            System.out.println("Sobresaliente");
        }

    }

    public static void actividad4switch(){
           //Con Switch
        int nota;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la nota a comprobar ");
        nota= sc.nextInt();sc.nextLine();


        switch(nota){
            case 0,1,2,3,4:System.out.println("Suspenso");
            break;
            case 5,6,7,8:System.out.println("Notable");
            break;
            case 9,10:System.out.println("Sobresaliente");
            break;
            default:
                System.out.println("Nota no válida");
                break;
                
         }
    }

    public static void actividad5(){
        //Actividad 5 : Comprobar si el año es bisiesto

        Scanner sc=new Scanner(System.in);

        int month,day,year;
        System.out.println("Escribe el día :");
        day=Integer.parseInt(sc.nextLine());
        if (day >0 && day <=31){
            System.out.println("Escribe el mes");
            month=Integer.parseInt(sc.nextLine());

                if (month<=12 && month>0){

                    System.out.print("Escribe el año: ");
                    year=Integer.parseInt(sc.nextLine());

                    if ((year % 4 ==0 && year % 100 != 0)||(year % 400 == 0)){
                        System.out.println("El "+day+"/"+month+"/"+year+ ".Es bisiesto ");
                    }
                    else{
                        System.out.println("La fecha " + day + "/" + month + "/" + year +"No es bisiesto");
                    }
                        
                }
            else{
                System.out.println("El mes no es correcto");
            }
        }
        else{
            System.out.println("El día no existe");
                
        }

    }

    public static void actividad6(){
        //Multiplos de 2 y 3 entre 50 y 200

        System.out.println("Números entre 50 y 200 múltiplos de 2 y 3:");
        for (int i = 50; i <= 200; i++) { // recorre los numeros desde el 50 al 200  
            if(i%2 == 0 && i%3 ==0){
                System.out.print(i + " ");
            }
        }
    }
    
    public static void actividad7(){
    //Factorial de un numero introducido

        int num;
        int producto=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero para calcular su factorial");
        num=sc.nextInt();
        if (num <0){

            System.out.println("Los factoriales no pueden ser negativos");

        }
        else{
            for(int i=1; i<=num;i++){
                producto=producto*i;
            }
            System.out.println("El factorial del "+num+" es: "+ producto);
        }


    }

    public static void actividad8(){
        //programa que muestre la edad máxima , mínima, media y cuantos son mayor de edad de un grupo de alumnos 

        Scanner sc = new Scanner(System.in);
        int edad;
        int maxima = 0;
        int minima = 0;
        int contador = 0;
        // variables nuevas del siguiente ejercicio
        int sumaEdades = 0;
        int mayoresDeEdad = 0;
        double media = 0;

        System.out.println("Introduce la edad del alumno (-1 para terminar):");
        edad = sc.nextInt();sc.nextLine();

        while (edad != -1) {
            sumaEdades = sumaEdades +edad;

            // Comprobamos si es mayor de edad 
            if (edad >= 18) {
                mayoresDeEdad++;
            }

            // Usamos el contador para saber si es  la primera edad y guardarla en max y min 
            if (contador == 0) {
                maxima = edad;
                minima = edad;
            } else {
                //  Actualizamos máximo y mínimo si hay más números ingresados
                if (edad > maxima) {
                    maxima = edad;
                }
                if (edad < minima) {
                    minima = edad;
                }
            }
            
            contador++; // Incrementamos el contador

            System.out.println("Introduce otra edad (-1 para terminar):");
            edad = sc.nextInt();sc.nextLine();
        }

        // Mostramos resultados si al menos se introdujo un alumno
        if (contador > 0) {
            //calculamos la media
            media = (double) sumaEdades / contador;
            System.out.println(" ---------------");
            System.out.println("Suma total de las edades: " + sumaEdades);
            System.out.println("La media de las edades es: " + media);
            System.out.println("Los alumnos mayores de edad son: " + mayoresDeEdad);

            System.out.println("La edad máxima es : " + maxima);
            System.out.println("LA edad mínima es : " + minima);
        } else {
            System.out.println("No se introdujo ninguna edad.");
        }

    }

    public static void actividad9(){
        //programa para adivinar un número aleatorio entre 1 y 100

        //Declaramos variables
        int numero, aleatorio,intentos=0;
        boolean  encontrado = false;
        aleatorio= (int)(Math.random()*100)+1;

        //Definimos la entrada por teclado
        Scanner sd=new Scanner(System.in);
        do{
            System.out.println("Dime un número entre 1 y 100");
            numero =sd.nextInt(); sd.nextLine();

            //Comprobacion

            if (numero>aleatorio){
                System.out.println("El numero es mayor al introducido");

            }
            else if (numero<aleatorio){
                System.out.println("El numero es menor al introducido");

            }
            else{
                System.out.println("¡¡Has acertado el numero!!");
            


            }
            intentos++;
            

           }while (numero!=aleatorio);
           System.out.println("Has utilizado "+intentos+" intentos");




    }

    public static void actividad10(){
        //programa que simula una calculadora

        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            // Mostramos el menú
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Introduce -1 para salir");
            System.out.print("Elige una opción: ");
            
            opcion = sc.nextInt();sc.nextLine();

            // Si la opción no es -1 pedimos los numeros con los que operar y hacemos la operación
            if (opcion != -1) {
                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el primer número: ");
                        num1 = sc.nextDouble(); sc.nextLine();
                        System.out.print("Introduce el segundo número: ");
                        num2 = sc.nextDouble(); sc.nextLine();
                        resultado = num1 + num2;
                        System.out.println("Resultado de la suma: " + resultado);
                        break;

                    case 2:
                        System.out.print("Introduce el primer número: ");
                        num1 = sc.nextDouble(); sc.nextLine();
                        System.out.print("Introduce el segundo número: ");
                        num2 = sc.nextDouble(); sc.nextLine();
                        resultado = num1 - num2;
                        System.out.println("Resultado de la resta: " + resultado);
                        break;

                    case 3:
                        System.out.print("Introduce el primer número: ");
                        num1 = sc.nextDouble(); sc.nextLine();
                        System.out.print("Introduce el segundo número: ");
                        num2 = sc.nextDouble(); sc.nextLine();
                        resultado = num1 * num2;
                        System.out.println("Resultado de la multiplicación: " + resultado);
                        break;

                    case 4:
                        System.out.print("Introduce el primer número: ");
                        num1 = sc.nextDouble(); sc.nextLine();
                        System.out.print("Introduce el segundo número: ");
                        num2 = sc.nextDouble(); sc.nextLine();
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado de la división: " + resultado);
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                        break;

                    default:
                        System.out.println("Opción no válida. Elige una opción correcta.");
                        break;
                }
            }

        } while (opcion != -1);

        System.out.println("¡Hasta pronto!");
    }

    public static void actividad11MCD(){

        int numero1, numero2,resto;
        System.out.println("Ingresa el número ");
        Scanner usuario=new Scanner(System.in);
        numero1=usuario.nextInt(); usuario.nextLine();
        numero2=usuario.nextInt(); usuario.nextLine();
        numero1=Math.abs(numero1);
        numero2=Math.abs(numero2);
        

        while(numero2 != 0){
            resto =numero1%numero2;
            numero1 = numero2;
            numero2= resto;
        }
        System.out.println("El MCD es: "+ numero1);
}
  
    public static void actividad11MCM(){

        int numero1, numero2, mayor, mcm;
        System.out.println("Ingresa los dos números ");
        Scanner usuario = new Scanner(System.in);
        numero1 = usuario.nextInt(); usuario.nextLine();
        numero2 = usuario.nextInt(); usuario.nextLine();
        
        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);
        
        mayor = Math.max(numero1, numero2);
        mcm = mayor;

        while(mcm % numero1 != 0 || mcm % numero2 != 0){
            mcm = mcm + mayor;
        }
        
        System.out.println("El MCM es: " + mcm);
    }

    public static void actividad12(){
        //programa que muestra las tablas de multiplicar del 1 al 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

        }



    }

    public static void actividad13_calcularCilindro(double altura, double radio){
        System.out.println("El área del cilindro es: " + (2 * PI * (altura + radio)));
        System.out.println("El volumen del cilindro es: " + (PI * (radio * radio) * altura));
    }
    
    public static void actividad14(int inicio,int fin){
        //imprimir los números pares divisibles por 2 y 3 que hay entre 1 y 20

        
        for( int i= inicio; i<=fin;i++){
            if(esPar(i) && (esDivisible2y3(i))){
                System.out.print(i+",");
            }
        }
    }

    public static int actividad15_contarDigitos(int n) {
        //Caso base
        if (n < 10) {
            return 1;
        } 
        else {
            //caso recursivo
            
            return 1 + actividad15_contarDigitos(n / 10);
        }
    }

    public static int actividad16_sumaRecursiva(int n) {
    // Caso base
        if (n == 1) {
            return 1;
        } else {
            // Caso recursivo
            return n + actividad16_sumaRecursiva(n - 1);
        }

    }

    public static int actividad17_potencia(int a, int b) {
        // Caso base, cualquier número elevado a 0 da 1
        if (b == 0) {
            return 1;
        } else {
            // Caso recursivo
            return a * actividad17_potencia(a, b - 1);
        }
    }





    

    public static void main(String[] args) {



        // Actividad 1, genera dos números aleatorios y nos da el cociente, media, potencia y raiz cuadrada
        // actividad1();
        
        // Actividad 2: Conocer si un número es divisible por 2 y 3.
        //actividad2();
        
        // Actividad 3 : Crear un programa con el diagrama del flujo dado (Ecuación de segundo grado)
        //actividad3();
        
        // Actividad 4  programa que nos pide una nota y nos indica la calificación
        //actividad4();
        
        // Con Switch (Actividad 4)
        //actividad4switch();
        
        // Actividad 5 : Comprobar si una fecha (29) es bisiesto
        //actividad5();

        // Actividad 6, Multiplos de 2 y 3 entre 50 y 200
        //actividad6();
        
        // Actividad 7: Factorial de un numero introducido
        // actividad7();
        
        // Actividad 8 : programa que muestre la edad máxima , mínima, media y cuantos son mayor de edad de un grupo de alumnos.
        // actividad8();
        
        // Actividad 9  programa para adivinar un número aleatorio entre 1 y 100
        //actividad9();

        // Actividad 10 :programa que simula una calculadora
        //actividad10();

        // Actividad 11 , MCM de dos números
        //actividad11MCM();

        // Actividad 11, MCD de dos números
        //actividad11MCD();
        
        // Actividad 12: programa que muestra las tablas de multiplicar del 1 al 10
        //actividad12();
        
        // Actividad 13 : Crear un programa que pide la altura y el radio para calcular el area y el volumen de un cilindro
        // actividad13_calcularCilindro(12.4,34.5);
        
        // Actividad 14:  imprimir los números pares divisibles por 2 y 3 que hay entre 1 y 20 usando dos funciones(esPar y esDivisible2y3)
        // actividad14(1,20);

        // Actividad 15:  Función que devuelve la cantidad de dígitos de un número (recursiva)
        // System.out.println(actividad15_contarDigitos(378));

        // Actividad 16:  Función que devuelve la suma de los números naturales desde 1 hasta N (Recursiva)
        // System.out.println(actividad16_sumaRecursiva(5));

        // Actividad 17:  Función que calcula a^b usando recursividad
        // System.out.println(actividad17_potencia(2,4));


        


     

    



    }   

    public static void  imprimir(String cadena,int variable){
        System.out.println(cadena+variable);
    }

    public static int suma(int a, int b){
        return a+b;
    }



    public static void areacilindro(double altura, double radio){
        double area;
        
        System.out.println("El area del cilindro es: "+ (2*PI*(altura+radio)));
    }
    public static void volumencilindro(double altura, double radio){
       System.out.println("El volumen del cilindro es: "+ (PI*(radio*radio)*altura));
    }



    public static boolean esPar(int numero){
        
        if (numero%2==0) return true;
        else return false;

    }
    public static boolean esDivisible2y3(int numero){
        if(numero%2 ==0 && numero%3==0) return true;

        else return false;

    }


    

}