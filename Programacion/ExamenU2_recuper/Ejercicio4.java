package ExamenU2_recuper;

public class Ejercicio4 {


    public static void main(String[] args) {
        imprimeTablero(false);
        
    }

    public static  void imprimeTablero(boolean valor){
        if (valor=true){
            System.out.println("Cuatro en raya");
            System.out.println("  X");
            System.out.println("  O X");
            System.out.println(" X O O");
            System.out.println("X O X O X");
            System.out.println("0 1 2 3 4 5 6");

        }else{
            System.out.println("Tres en raya");
            System.out.println("X O X");
            System.out.println("  O ");
            System.out.println("  X ");
            System.out.println("0 1 2 3");

        }
    }
    
}
