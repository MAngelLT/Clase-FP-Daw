public class Videojuego {

    private String titulo;
    private double precio;
    private boolean enStock;
    //constructor con parámetros
    public  Videojuego(String titulo, double precio){
        this.titulo=titulo;
        this.precio=precio;

    }

    //método : Es una acción o función que pertenece exclusivamente a los objetos de esa clase
    // muestra la información del videojuego
    public void mostrarInfo(){
        System.out.println("Juego: "+ titulo+" |||  precio: "+precio+" Euros");
    }



    public static void main(String[] args) {

        //Se crea un objeto de la clase Videojuego

        Videojuego juego1=new Videojuego("Valheim", 25);
        Videojuego juego2=new Videojuego("GTA V", 40);
        Videojuego juego3=new Videojuego("GTA VI", 100);



        //LLamamos el metodo que creamos para mostrar la inf de cada objeto que creamos
        juego1.mostrarInfo();
        
    }
    
}
