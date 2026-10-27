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
    private boolean soltero_casado;

    //Constructores
    public Persona3(){}
    public Persona3(String nombre, String fecha,String direccion, char genero,boolean estado){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt); 
        this.nombre=nombre;
        this.direccion=direccion;
        this.genero=genero;
        this.soltero_casado=estado;
    }
    public Persona3(Persona3 objeto){
        this.nombre=objeto.getNombre();
        this.DNI=objeto.getDNI();
        this.direccion=objeto.getDNI();
        this.genero=objeto.getGenero();
        this.soltero_casado=objeto.getSoltero_casado();
    }

    //Métodos
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
        return soltero_casado;
    }
    public void setSoltero_casado(boolean soltero_casado) {
        this.soltero_casado = soltero_casado;
    }    
    
}

