public class CuentaBancaria {

    //Atributos
    private String titular;
    private double saldo;

    public  CuentaBancaria(String titular, double saldo){
        this.titular= titular;
        this.saldo=saldo;

    }

    //getters y setters (encapsulan los atributos para consultarlos y  modificarlos de forma controlada <)
    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodo
    public  void consultarSaldo() {
        System.out.println("EL saldo es de "+saldo+" Euros");
    
        
    }
    //método
    public void depositar(double cantidad){
        this.saldo = saldo + cantidad; //se indica el atributo y se modifica
        
        System.out.println("Se han depositado "+cantidad+" Euros.");
    }

    public void retirar(double cantidad){
        if(this.saldo>=cantidad){
            this.saldo=saldo-cantidad;
        }else{
            System.out.println("Su saldo es insuficiente");
        }

    }

    public static void main(String[] args) {

        CuentaBancaria p1=new CuentaBancaria("Xavi", 150);
        p1.getSaldo;
        

        
    }
    
}
