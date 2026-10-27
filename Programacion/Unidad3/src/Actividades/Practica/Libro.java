package Actividades.Practica;

public class Libro {
    private String isbn;
    private String titulo;
    private int anio;
    private double precio;
    private Editorial ed;

    //Constructores
    public Libro(){}
    public Libro(String titulo, int anio,double precio){
        this.titulo=titulo;
        this.anio=anio;
        this.precio=precio;
    }
    public Libro(String titulo){
        this.titulo=titulo;
    }
    public Libro(Libro copia){
        this.titulo=copia.getTitulo();
        this.anio=copia.getAnio();
        this.isbn=copia.getIsbn();
        this.precio=copia.getPrecio();
    }
    //Métodos
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Editorial getEd() {
        return ed;
    }
    public void setEd(Editorial ed) {
        this.ed = ed;
    }
    
    public void imprimeLibro(){
        System.out.println("El libro se llama: "+titulo);
        System.out.println("El precio es: "+precio);
        if(ed!=null){
            System.out.println("La editorial es: "+ed.getNombre());
        }
    }
}
