package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class tarjeta {

    //atributos
    private int numero;
    private String nombre;
    private int codigo;
    private String fechaVenc;
    private cliente cliente;
    

    //constructor por defecto
    public tarjeta() {}

    //constructor con parametros

    public tarjeta(int codigo, String nombre, String fechaVenc, int numero, cliente cliente){
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaVenc = fechaVenc;
        this.numero = numero;
        this.cliente = cliente;

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

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }
    //método
    public void imprimir() {
        System.out.println("Tarjeta: " + this.nombre + " -- Número: " + this.numero);
        System.out.println("Código: " + this.codigo + " -- Vencimiento: " + this.fechaVenc);
        if (this.cliente != null) {
            System.out.println("Titular: " + this.cliente.getNombre());
        }
        System.out.println("-----------------------------------------------------------");
    }





    
    
    
}
