package Actividades.Practica;

public class Editorial {
    private int codigo;
    private String nombre;
    private int anio;

    //Constructores
    public Editorial(){}
    public Editorial(String nombre){
        this.nombre=nombre;
    }
    public Editorial(Editorial copia){
        this.nombre=copia.getNombre();
        this.anio=copia.getAnio();
        this.codigo=copia.getCodigo();
    }
    //Métodos
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}