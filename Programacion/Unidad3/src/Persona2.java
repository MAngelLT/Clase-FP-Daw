import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
enum estadoCivil{
    SOLTERO,CASADO,DIVORCIADO
}
public class Persona2 {
    //atributos
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    String DNI;
    static int hijos;
    Persona2 pareja;
    estadoCivil estado;

    //Constructor por defecto
    public Persona2(){
        this.estado=estadoCivil.SOLTERO;
    }
    //Constructor por parámetros
    public Persona2(String DNI,String fecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt); 
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
    }
    //Constructor por copia
    public Persona2(Persona2 objeto){
        this.nombre=objeto.getNombre();
        this.fechaNacimiento=objeto.getFechaNacimiento();
        this.estatura=objeto.getEstatura();
        this.DNI=objeto.getDNI();
        this.hijos=objeto.getHijos();
        this.pareja=objeto.getPareja();

    }
    //métodos
    public void setHijos(int hijos){
        this.hijos=hijos;
    }

    public estadoCivil getEstado() {
        return estado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public void setEstado(estadoCivil estado) {
        this.estado = estado;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public static int getHijos() {
        return hijos;
    }
    public Persona2 getPareja() {
        return pareja;
    }
    public void setPareja(Persona2 pareja) {
        this.pareja = pareja;
    }
    public static void imprime(){
        System.out.println("HOLA");
    }
    public void imprimePersona(){
        System.out.println("Te llamas: "+this.nombre);
        System.out.println("Mides: "+this.estatura);
        System.out.println("TU DNI es: "+this.DNI);
        System.out.println("Naciste el día: "+this.fechaNacimiento);
        System.out.println("Número de hijos"+this.hijos);
        if(pareja!=null){
            System.out.println("Su pareja tiene el nombre: "+this.pareja.getNombre());
            System.out.println("Mides: "+this.pareja.getEstatura());
            System.out.println("TU DNI es: "+this.pareja.getDNI());
            System.out.println("Naciste el día: "+this.pareja.getFechaNacimiento());
        }
    }
    public void imprimeconString(){
        System.out.println("Te llamas: "+this.nombre);
        System.out.println("Mides: "+this.estatura);
        System.out.println("TU DNI es: "+this.DNI);
        System.out.println("Naciste el día: "+this.fechaNacimiento);
        System.out.println("Número de hijos"+this.hijos);
        System.out.println("Los datos de tu pareja son: "+this.pareja);
    }

    public void imprimeSoltero(){
        if(estado==estadoCivil.SOLTERO){
            System.out.println(this);
        }
    }
    @Override
    public String toString() {
        return "Persona2 [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", estatura=" + estatura
                + ", DNI=" + DNI + "]";

    }
    // public void asignaPareja(Persona2 pareja){
    //     this.pareja=pareja;
    // }
    public static void main(String[] args) {
        Persona2 p=new Persona2("12345678A","15/08/1985");

        Persona2 p2=new Persona2("12345678B","01/07/1987");
        p2.setPareja(p);
        p.setPareja(p2);
        // p.imprimePersona();
        p2.imprimeconString();

        p2.setNombre("Domingo");
        p.setNombre("María");
        p2.imprimeconString();
        p2.setEstado(estadoCivil.CASADO);

        p2.imprimeSoltero();
    }
}
