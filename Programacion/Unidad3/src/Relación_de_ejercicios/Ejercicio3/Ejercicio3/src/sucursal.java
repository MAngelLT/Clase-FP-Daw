package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class sucursal {
   //Atributos
    private int numero;
    private String domicilio;
    private String ciudad;
    private cliente cliente; 
    private double descuento;


//constructores
    public sucursal() {}

    public sucursal(int numero, String domicilio, String ciudad, cliente cliente, double descuento) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.cliente = cliente;
        this.descuento = descuento;
    }

    //getters y setters

      public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
   

    //métodos
    public void imprimir() {
        System.out.println("Sucursal Nº: " + this.numero );
        System.out.println("Ciudad: " + this.ciudad);
        System.out.println("Domicilio: " + this.domicilio);
        if (this.cliente != null) {
            System.out.println("Cliente que compra: " + this.cliente.getNombre() + " // Descuento aplicado: " + this.descuento + "%");
        }
        System.out.println("-----------------------------------------------------------");
    }

  



}
