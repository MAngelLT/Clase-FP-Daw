package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;

public class empleado {
    private String DNI;
    private String nombre;
    private String legajo;
    private int telefono;
    private String domicilio;
    //constructores
    public empleado(){}
    public empleado(String DNI,String nombre,String legajo, int telefono, String domicilio){
        this.DNI = DNI;
        this.nombre = nombre;
        this.legajo = legajo;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    //getters y setters
    
    public static void main(String[] args) {
        
    }
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
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    //metodos
    public void imprimir() {
        System.out.println("Datos del empleado: " + this.nombre + " -- Legajo: " + this.legajo + " -- DNI: " + this.DNI);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Domicilio del empleado: " + this.domicilio );
        System.out.println("-----------------------------------------------------------");
    }

    //otra forma .. source action -> generate to string.

    // @Override
    // public String toString() {
    //     return "Datos del empleado= [DNI=" + DNI + ", nombre=" + nombre + ", legajo=" + legajo + ", telefono=" + telefono
    //             + ", domicilio=" + domicilio + "]";
    // }

    

    


    
}

