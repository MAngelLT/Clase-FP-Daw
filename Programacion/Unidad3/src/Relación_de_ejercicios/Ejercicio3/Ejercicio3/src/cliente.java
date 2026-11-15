package Relación_de_ejercicios.Ejercicio3.Ejercicio3.src;


public class cliente {

    //Atributos
    private String DNI;
    private String nombre;
    private String fechaNacimiento;
    private String ciudad;
    private int codigo;

    //getters y setters

    public String getNombre() {
        return nombre;
    }
       public void setNombre(String nombre) {
        this.nombre=nombre;
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
    //constructores
    public cliente(){}

    public cliente(int codigo,String DNI,String nombre,String fechaNacimiento,String ciudad){
        this.codigo=codigo;
        this.DNI=DNI;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.ciudad = ciudad;

    }
    
    public void imprimir(){
        System.out.println("Cliente: " + this.nombre + " /// Código: " + this.codigo);
        System.out.println("DNI: " + this.DNI + " /// Ciudad: " + this.ciudad + " /// Fecha Nac: " + this.fechaNacimiento);
        System.out.println("-----------------------------------------------------------");
    }




    
    
}
