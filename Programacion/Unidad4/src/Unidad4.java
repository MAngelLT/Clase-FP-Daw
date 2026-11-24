public class Unidad4 {
    public static void main(String[] args) {
        //******VECTORES****

        
        //Creación de vector de enteros
        int[] array={4,7,3,9}; 
        //Puedo acceder a posiciones desde 0 a su longitud
        array[0]=3;  //cambiamos la posición 0 que era 4 a un 3

        //Puedo recorrer su contenido e imprimirlo. Fijaros que empieza en 0 y termina en longitud
        System.out.println("Vector inicial: ");
        for(int i=0;i<4;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
        //Y si quiero cambiar el contenido?
        System.out.println("Vector RESULTADO: ");
        for(int i=0;i<4;i++){
            array[i]=(int) (Math.random()*(10)+1);//cada vector tiene un número aleatorio del 1 al 10
            System.out.print(array[i]+", ");
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
    }
    
    
}
