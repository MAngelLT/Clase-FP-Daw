package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class fabrica {

    private int CUIT;
    private String nombre;
    private String pais;
    private String gerente;
    private int cantEmp;
    
    

    public fabrica(){}
    public fabrica(int CUIT, String nombre, String pais, String gerente, int cantEmp){
        this.CUIT = CUIT;
        this.nombre = nombre;
        this.pais = pais;
        this.gerente = gerente;
        this.cantEmp = cantEmp;


    }

    //getters y setters
    public int getCUIT() {
        return CUIT;
    }
    public void setCUIT(int cUIT) {
        CUIT = cUIT;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    public int getCantEmp() {
        return cantEmp;
    }
    public void setCantEmp(int cantEmp) {
        this.cantEmp = cantEmp;
    }

    //métodos
    public void imprimir() {
        System.out.println("Fábrica: " + this.nombre + " -- Número CUIT: " + this.CUIT);
        System.out.println("País: " + this.pais);
        System.out.println("Gerente: " + this.gerente);
        System.out.println("Empleados: " + this.cantEmp);
        System.out.println("-----------------------------------------------------------");
    }







}
