package ExamenU2_recuper;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        int win_usu=0;
        int win_pc=0;
        boolean hayVictoria=false;  
        int cercaUsu=0;
        int cercaPC=0;      

        //Generar 2 números de manera aleatoria
        int max=20;
        int min = 1;
        int numAleatorio=(int)(Math.random()*(max-min+1)+min);
        int numAleatorioPC=(int)(Math.random()*(max-min+1)+min);


        System.out.println("Juego de adivinar un numero aleatorio del 1-20 contra PC");
        System.out.println("Ingresa un número:");
        int num_usu=leer.nextInt();leer.nextLine();

        while(num_usu!=-1 || win_pc!=3 ){//bucle con las condiciones para terminar la partida
            
            System.out.println("El numero de la pc es"+numAleatorioPC);
            System.out.println("El numero de a encontrar era: "+numAleatorio);

            if(num_usu==numAleatorio){
                win_usu++; //contador victorias de usuario
                hayVictoria=true;
                System.out.println("Victoria en esta ronda para el usuario!! ");

            }else if(numAleatorioPC==numAleatorio){
                //victoria de Pc
                win_pc++;
                hayVictoria=true;
                System.out.println("Victoria en esta ronda  para la PC!!");

            }

            if(hayVictoria==false){//nadia ha ganado
                cercaUsu=numAleatorio-num_usu;
                cercaPC=numAleatorioPC-numAleatorioPC;
                if((Math.abs(cercaPC))>(Math.abs(cercaUsu))){
                    System.out.println("El numero de la PC esta mas cerca por " +cercaPC);
                }else{
                    System.out.println("El numero del usu esta mas cerca por " +cercaUsu);
                }
            }

            

            
            
            System.out.println("----------------------------------------------");
            System.out.println("Ingresa un número");
            num_usu=leer.nextInt();leer.nextLine();

            numAleatorioPC=(int)(Math.random()*(max-min+1)+min);
            System.out.println("Turno de la Pc: "+numAleatorioPC);

            hayVictoria=false;

            


        }

        System.out.println("El usuario ha ganado "+win_usu+" rondas");
        System.out.println("El PC ha ganado "+win_pc+" rondas");






        

    }

    


    
}
