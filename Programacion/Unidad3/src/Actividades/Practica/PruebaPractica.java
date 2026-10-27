package Actividades.Practica;

public class PruebaPractica {
    public static void main(String[] args) {
        
        //Crear un libro
        Libro libro1 = new Libro("La isla del tesoro",1974,19.95);
        Editorial SM = new Editorial("SM");
        libro1.imprimeLibro();
        libro1.setEd(SM);
        libro1.imprimeLibro();
    }
}
