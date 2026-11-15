package Actividades.Actividad1;


public class CuentaCorriente {
    //ATRIBUTOS
    private String numeroCuenta;
    private double saldo;
    private Persona3 cliente;

    //Constructores
    public CuentaCorriente(){}
    public CuentaCorriente(Persona3 cliente,String numeroCuenta,double saldo){
        this.cliente=cliente;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }
    public CuentaCorriente(CuentaCorriente copia){
        this.numeroCuenta=copia.getNumeroCuenta();
        this.saldo=copia.getSaldo();
        this.cliente=copia.getCliente();
    }
    //Métodos
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Persona3 getCliente() {
        return cliente;
    }
    public void setCliente(Persona3 cliente) {
        this.cliente = cliente;
    }   
    public void imprimeCuenta(){
        System.out.println("El número de cuenta es: "+this.numeroCuenta);
        System.out.println("El saldo es: "+ this.saldo);
        if(cliente!=null){
            // System.out.println(cliente.getNombre());
            // System.out.println("Mi dirección es: "+cliente.getDireccion());
            cliente.imprimeInformacion();//llamamos al metodo que muestra la información del cliente
        }
    }
    

    // imprime la información
    @Override
    public String toString() {
        return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }   





}
