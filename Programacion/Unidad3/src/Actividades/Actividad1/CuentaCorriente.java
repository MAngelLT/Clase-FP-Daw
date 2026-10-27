package Actividades.Actividad1;



public class CuentaCorriente {
    //Datos miembro
    private String numeroCuenta;
    private double saldo;
    private Persona3 cliente;

    //Constructores
    public CuentaCorriente(){}
    public CuentaCorriente(String numeroCuenta,double saldo){
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


    public static void main(String[] args) {


        
    }
}
