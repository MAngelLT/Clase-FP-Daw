import java.util.Scanner;

public class Gestor_de_Notas {

    static final int NOTA_MAXIMA = 10;
    static final int NOTA_MINIMA = 0;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double suma = 0;
        double notaBaja = 10;
        double notaAlta = 0;

        int contadorNotas = 0;
        int num;
        double media=0;
        

        do {

            mostrarMenu();

            System.out.print("Elige una opción: ");
            num = leer.nextInt();

            //switch
            System.out.println();

            switch (num) {
                case (1):
                    System.out.println("Ingresa una nota");
                    int nota =leer.nextInt();
                    while(nota >NOTA_MAXIMA|| nota<NOTA_MINIMA){
                        System.out.println("Nota invalida ingresa una correcta");
                        System.out.println("Ingresa una nota");
                        nota =leer.nextInt();

                    }
                    if(nota>notaAlta){
                        notaAlta=nota;
                    }
                    if(nota<notaBaja){
                        notaBaja=nota;
                    }
                    contadorNotas++;
                    suma=suma+nota;
                    

                    break;
                case(2):
                    try{
                    media=Calcularmedia(suma, contadorNotas);
                    System.out.println("La media es "+media);
                    }catch(Exception e){
                        System.out.println("No se puede dividir por 0 . intenta añadir una nota primero "+e.getMessage());
                    }
                    break;
                case(3):
                    
                    if(media >=0 && media <5){
                        System.out.println("Estas Suspenso");
                    }
                    else if(media >=5 && media <8){
                        System.out.println("Estas aprobado");
                    }
                    else if(media >=7 && media <9){
                        System.out.println("Tienes notable");
                    }
                    else if(media >=9 && media <11){
                        System.out.println("Tienes Sobresaliente");
                    }else{
                        System.out.println("Has introducido valores incorrectos");
                    }
                    break;
                case(4):

                    System.out.println("Trabajando.... ");
                    mostrarEstadisticas(notaAlta, notaBaja);
                    break;
                   
                    
            
            
                default:
                    break;
            }

        } while (num != 0);
        System.out.println("Bye bye");

        leer.close();
    }
    //procedimiento 
    public static void mostrarMenu() {
    System.out.println("****** Gestor de Notas ******");
    System.out.println("1. Introducir una nota");
    System.out.println("2. Mostrar la media");
    System.out.println("3. Mostrar la calificación");
    System.out.println("4. Mostrar estadísticas");
    System.out.println("0. Salir");
    }
    //funcion
    public static  double Calcularmedia(double suma,int contadorNotas){
        double notaMedia=suma/contadorNotas;
        
        return notaMedia;


    }

    public static void mostrarEstadisticas(double notaAlta, double notaBaja){
        System.out.println("La nota más alta es: "+ notaAlta);
        System.out.println("la nota más baja es : "+notaBaja);
        

    }
}