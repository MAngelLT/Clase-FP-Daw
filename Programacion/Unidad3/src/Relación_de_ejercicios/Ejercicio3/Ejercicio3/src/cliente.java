import java.time.LocalDate;

public class cliente {

    //Atributos
    private String DNI;
    private String nombre;
    private String fechaNacimiento;
    private String ciudad;
    private int codigo;

    //getters y setters
    public String nombre() {
        return nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public cliente(int codigo,String DNI,String nombre,String fechaNacimiento){
        this.codigo=codigo;
        this.DNI=DNI;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;

    }
    
    public void imprimir(){
        
    
        System.out.println();
    }


    public static void main(String[] args) {

        cliente p1=new cliente(001, "77777777A", "jeronimo","10/07/2032" );

        p1.imprimir();
        
    }



    
    
}
