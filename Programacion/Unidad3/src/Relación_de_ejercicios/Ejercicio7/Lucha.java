package Relación_de_ejercicios.Ejercicio7;

public class Lucha {


    public static void main(String[] args) {
    
        //Se crea un heroe y un monstruo
        
        Heroe hero1=new Heroe("Iron-man", 200, 23);
        Monstruo mons1=new Monstruo("Lagarto", 300, 15);

        hero1.mostrarInf();
        mons1.mostarInf();
        System.out.println("-----------------------------");
        // Creamos la varible turno para decidir quien empieza
        int turno = (int) (Math.random() * 2) + 1;

        while (hero1.getVida()>0 && mons1.getVida()>0) {
            if (turno == 1) {
                mons1.recibirDaño(hero1.getAtaque());
                System.out.println(hero1.getNombre() + " ataca. Vida de " + mons1.getNombre() + ": " + mons1.getVida());
                turno = 2;
            } else {
                hero1.recibirDaño(mons1.getAtaque());
                System.out.println(mons1.getNombre() + " ataca. Vida de " + hero1.getNombre() + ": " + hero1.getVida());
                turno = 1;
            }

        }

         System.out.println("------------------------");
        if (hero1.getVida()==0) {
            System.out.println("Gana " + mons1.getNombre() + " con " + mons1.getVida() + " de vida");
        
        }
        else {
            
            System.out.println("Gana " + hero1.getNombre() + " con " + hero1.getVida() + " de vida");
           
        }


    }

        
}
    

