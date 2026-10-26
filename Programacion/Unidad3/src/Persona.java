public class Persona {

    //atributos
    String nombre;
    String apellido;
    String DNI;
    String estadoCivil;
    int telefono;
    int edad;
    double estatura;

    //Constructor con parámetros
    public Persona( String nombre, String apellido, String DNI ){
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;

    }

    //Métodos get y set  (click derecho "Source action")
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
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public static void main(String[] args) {

        Persona p1= new Persona("Miguel", "Lapo", "12345678W");

        //Usando get y set para guardar o conseguir información

        p1.setEstatura(1.95);
        System.out.println("La estatura de "+p1.getNombre()+" es de :"+ p1.getEstatura()+" cm");
        
    }
}