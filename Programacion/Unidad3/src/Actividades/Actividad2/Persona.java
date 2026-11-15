package Actividades.Actividad2;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;
    private Fecha fechaNacimiento;
    private Ciudad ciudadNacimiento;
    private Ciudad ciudadResidencia;

    // Constructor por defecto
    public Persona() {
        this.cedula = "IDK";
        this.nombre = "IDK";
        this.apellido = "IDK";
        this.genero = '0';
        this.fechaNacimiento = new Fecha();
        this.ciudadNacimiento = new Ciudad();
        this.ciudadResidencia = new Ciudad();
    }

    // Constructor con parámetros
    public Persona(String cedula, String nombre, String apellido, char genero, 
                   Fecha fechaNacimiento, Ciudad ciudadNacimiento, Ciudad ciudadResidencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNacimiento = ciudadNacimiento;
        this.ciudadResidencia = ciudadResidencia;
    }

    // Constructor copia
    public Persona(Persona otraPersona) {
        this.cedula = otraPersona.cedula;
        this.nombre = otraPersona.nombre;
        this.apellido = otraPersona.apellido;
        this.genero = otraPersona.genero;
        this.fechaNacimiento = new Fecha(otraPersona.fechaNacimiento);
        this.ciudadNacimiento = new Ciudad(otraPersona.ciudadNacimiento);
        this.ciudadResidencia = new Ciudad(otraPersona.ciudadResidencia);
    }

    // Getters y Setters

     public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudad getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(Ciudad ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public Ciudad getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(Ciudad ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    

    // Método para mostrar información
    public void imprimeInformacion() {
        System.out.println("--------------------------------------------------");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre y Apellido: " + nombre + " " + apellido);
        System.out.println("Género: " + genero);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Ciudad de Nacimiento: " + ciudadNacimiento);
        System.out.println("Ciudad de Residencia: " + ciudadResidencia);
        System.out.println("--------------------------------------------------");
    }

   
    
}
