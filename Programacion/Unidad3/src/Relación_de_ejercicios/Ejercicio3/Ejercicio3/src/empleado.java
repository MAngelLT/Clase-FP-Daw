package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class empleado {
    private String DNI;
    private String nombre;
    private String legajo;
    private int telefonos;
    private String domicilio;
    //constructores
    public empleado(){}
    public empleado(String DNI,String nombre){
        this.DNI= DNI;
        this.nombre=nombre;
    }

    //getters y setters
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLegajo() {
        return legajo;
    }
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public int getTelefonos() {
        return telefonos;
    }
    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    






    public static void main(String[] args) {
        
    }

    


    
}

