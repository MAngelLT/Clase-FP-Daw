public class Unidad4 {
    public static void main(String[] args) {
        //******VECTORES****

        
        //Creación de vector de enteros  es estatico
        int[] numero={4,7,3,9}; 
        //Puedo acceder a posiciones desde 0 a su longitud
        numero[0]=3;  //cambiamos la posición 0 que era 4 a un 3

        //Puedo recorrer su contenido e imprimirlo. Fijaros que empieza en 0 y termina en longitud
        System.out.println("Vector inicial: ");
        for(int i=0;i<4;i++){
            System.out.print(numero[i]+", ");
        }
        System.out.println();
        //Y si quiero cambiar el contenido?
        System.out.println("Vector RESULTADO: ");
        for(int i=0;i<4;i++){
            numero[i]=(int) (Math.random()*(10)+1);//cada vector tiene un número aleatorio del 1 al 10
            System.out.print(numero[i]+", ");
        }
        System.out.println();
        
        //Sólo pueden ser vectores de tipos básicos como int, double?? NO
        Persona p1= new Persona("David",33);
        Persona p2= new Persona("María",25);
        p1.setPareja(p2);
        //Vector personas que tiene dos valores nulos y que se asignará la referencia a los dos anteriores
        Persona[] personas={null,null};
        personas[0]=p1;
        personas[1]=p2;
        //Mostrar contenido de p1
        p1.infoPersona();






        int[] resultado=null;

        resultado= multiplica2(numero);

        //Sacar resultado
        System.out.println("Resultado: ");
        for(int i=0; i<resultado.length;i++){
            System.out.print(resultado[i]+",");
        }


        //salida cuando se usa el propio parámetro dentro de la función
        multiplica2bis(numero);

        //sacar resultado
        System.out.println("Resultado: ");
        for(int i=0;i<numero.length;i++){
            System.out.print(numero[i]+",");
        }
        System.out.println();

    }

    public static int[] multiplica2(int[] vector){
        int[] salida={0,0,0,0};
        for(int i=0;i<vector.length;i++){
            salida [i]=2*vector[i];
        }

        return salida;

    }
        //este procedimiento ha cmabiado el vector original
        public static void multiplica2bis(int[] vector){//Los vectores son una direccion  si lo usamos como variable se vera modificada
        
        for(int i=0;i<vector.length;i++){  //una buena practica es crear otro vector para evitar modificar el vector original
            vector [i]=2*vector[i];
        }

        

    }
    
    
}
