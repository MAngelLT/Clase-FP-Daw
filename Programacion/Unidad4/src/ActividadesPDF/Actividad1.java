package ActividadesPDF;

public class Actividad1 {


   
   
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,0};

        System.out.println(buscaEnVector(num,4));

    }

    public static int buscaEnVector(int[]num,int numero){
        int ubicacion=-1;
        for(int i=0;i<num.length;i++ ){
            if (num[i]==numero) ubicacion=i;
        

        }
        return ubicacion;

    }

    //variante  imprime numeros hasta el que te indican
    public static int buscaEnVectorWhile(int[]num,int numero){
        int encontrado=-1;
        boolean salida=false;


        while (! salida){
            if (num[i]==numero){
                encontrado=i;
                salida=true
            }
            i++;
                
    }


    
}
