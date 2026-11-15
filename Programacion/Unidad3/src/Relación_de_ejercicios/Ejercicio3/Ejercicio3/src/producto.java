package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class producto {

    private int codigo;
    private String descripcion;
    private String color;
    private double costo;
    private fabrica fabrica; // relación 1:1 con fabrica
    

    public producto(){}
    public producto(int codigo, String descripcion, String color, double costo, fabrica fabrica){

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.color = color;
        this.costo = costo;
        this.fabrica = fabrica;

    }

    //getters y setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public fabrica getFabrica() {
        return fabrica;
    }
    public void setFabrica(fabrica fabrica) {
        this.fabrica = fabrica;
    }

    //métodos
    public void imprimir() {
        System.out.println("Producto: " + this.descripcion + " // Código: " + this.codigo);
        System.out.println("Color: " + this.color + " // Costo: " + this.costo);
        if (this.fabrica != null) {
            System.out.println("Fábrica: " + this.fabrica.getNombre());
        }
        System.out.println("-----------------------------------------------------------");
    }



    public static void main(String[] args) {
        
    }


}
