package Relación_de_ejercicios.Ejercicio8;

public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private String telefono;
    private String poblacion;

    //constructores

    public Persona(){
        this.nombre = "desconocido";
        this.edad = 0;
        this.telefono = "desconocido";
        this.poblacion = "desconocida";

    }
    
    public Persona(String nombre, int edad,String telefono,String localidad){
        this.nombre=nombre;
        this.edad=edad;
        this.telefono=telefono;
        this.poblacion=localidad;

    }

    public Persona(Persona copia){
        this.nombre = copia.nombre;
        this.edad = copia.edad;
        this.telefono = copia.telefono;
        this.poblacion = copia.poblacion;
        
    }


    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    //método para imprimir la inf

    public void imprimirInf(){
        System.out.println("Nombre: "+nombre+" Edad: "+getEdad()+" Teléfono: "+getTelefono()+ " Población: "+ getPoblacion());

    }

    




    
    
}
