package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class tarjeta {

    //atributos
    private int numero;
    private String nombre;
    private int codigo;
    private String fechaVenc;
    private cliente cliente;
    



    //constructor con parametros

    public tarjeta(int codigo,String nombre, String fechaVenc,int numero){

        this.codigo=codigo;
        this.nombre=nombre;
        this.fechaVenc=fechaVenc;
        this.numero=numero;

    }

    //getters y setters



    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCodigo() {
        return codigo;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public String getFechaVenc() {
        return fechaVenc;
    }



    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }


    public static void main(String[] args) {

        tarjeta t1=new tarjeta(0, null, null, 0);
        
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }



    
    
    
}
