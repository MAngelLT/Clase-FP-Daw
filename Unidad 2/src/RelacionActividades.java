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

        dia = sc.nextInt(); sc.nextLine();
        mes = sc.nextInt(); sc.nextLine();

        //Usamos la condicinal para distribuir los meses con el signo Zodiacal
        
        if

    }




    public static void main(String[] args) {

        saludo();

        salariosemanal();
    
    }
    
}
