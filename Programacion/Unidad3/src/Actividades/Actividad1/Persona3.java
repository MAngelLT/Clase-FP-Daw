package Actividades.Actividad1;
 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona3 {
    //Datos miembro
    private String nombre;
    private String DNI;
    private LocalDate fechaNacimiento;
    private String direccion;
    private char genero;
    private boolean casado;

    //Constructores
    public Persona3(){}
    public Persona3(String nombre,String DNI, String fecha,String direccion, char genero,boolean estado){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt); 
        this.nombre=nombre;
        this.direccion=direccion;
        this.genero=genero;
        this.casado=estado;
        this.DNI=DNI;
    }
    public Persona3(Persona3 objeto){
        this.nombre=objeto.getNombre();
        this.DNI=objeto.getDNI();
        this.direccion=objeto.getDNI();
        this.genero=objeto.getGenero();
        this.casado=objeto.getSoltero_casado();
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public boolean getSoltero_casado() {
        return casado;
    }
    public void setSoltero_casado(boolean casado) {
        this.casado = casado;
    }    

    //método para mostrar la inf.
    public void imprimeInformacion() {
        System.out.println("---------------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Dirección: " + direccion);
        System.out.println("Género: " + genero);
        System.out.println("Estado Civil= casado? " + casado);
        System.out.println("---------------------------------------------");
    }


    
}

