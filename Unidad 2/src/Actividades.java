public class Actividades {
    public static void main(String[] args) {


     //Actividad 1, diapositiva 9


    //Generar 2 números de manera aleatoria
    int max=26;
    int min = 1;
    double aleatorio=(int)(Math.random()*(max-min+1)+min);
    double aleatorio2=(int)(Math.random()*(max-min+1)+min);
    //Realizar las operaciones
    System.out.println("El primer número es: "+ aleatorio);
    System.out.println("El segundo número es: "+ aleatorio2);
    // System.out.println(Math.divideExact(aleatorio, aleatorio2));
    System.out.println("El cociente es: " +(aleatorio/aleatorio2));
    System.out.println("La media es: " +((aleatorio+aleatorio2)/2));
    System.out.println("La potencia es : " +(Math.pow(aleatorio, aleatorio2)));
    System.out.println("La raiz cuadrada del primer numero es: " +(Math.sqrt(aleatorio)));
    System.out.println("La raiz cuadrada del segundo numero es: " +(Math.cbrt(aleatorio)));
    

    // Actividad 2¿Como sabemos si un número es divisible por 2 y por 3?

    int digito= 4;
    if (digito %2 == 0 && digito %3 == 0){
        System.out.println("El numero es divisible por dos y por 3");
    }
    else{
        System.out.println("No es divisible para 2 y 3");

    }
    


    }
}