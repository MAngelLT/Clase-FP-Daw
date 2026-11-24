import java.util.Scanner;

public class mixto {

    
    
    public static void main(String[] args) {
        int num_Alto_posi=0;
        int num_Men_neg=0;
        boolean hay_posi=false;
        boolean hay_neg=false;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa numeros y puedes salir al introducir 0");
        int num_usu=leer.nextInt();leer.nextLine();
        while(num_usu!=0){
            if (num_usu>0){
                hay_posi=true;
                if(num_usu>num_Alto_posi)

                    num_Alto_posi=num_usu;
            }
             if (num_usu<0){
                hay_neg=true;
                if(num_usu<num_Men_neg)

                    num_Men_neg=num_usu;
            }
            System.out.println("Ingresa otro numero");
            num_usu=leer.nextInt();leer.nextLine();
            
        }
        
        if(hay_posi!= true){
            System.out.println("No hay numeros positivos");
        }else{
            System.out.println("el numero positivo más grande es "+ num_Alto_posi);
        }
        if(hay_neg!= true){
            System.out.println("No hay numeros negativos");
        }else{
            System.out.println("el numero negativo más pequeño es "+ num_Men_neg);
        }
    }
}
