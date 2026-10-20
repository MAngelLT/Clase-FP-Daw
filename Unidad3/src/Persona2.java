import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona2 {


    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    final String DNI;
    static int hijos;
    Persona2 pareja;

    public Persona2(String DNI,String fecha){
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.fechaNacimiento=LocalDate.parse(fecha,fmt);
    this.DNI=DNI;
    this.hijos=2;
    this.pareja=null;
    }

    //Práctica: Completa los métodos get y set de forma automática
    





    public void asignaPareja(Persona2 p){
        this.pareja=p; //Hará referencia a la ya existente
    }

 public static void main(String[] args) {
    Persona2 p=new Persona2("12345678A","15/08/1985");
    p.obtenerEdad();
    System.out.println("Tienes "+p.hijos+" hijos");
    Persona2 p2=new Persona2("12345678B","01/07/1987");
    p.hijos=3;
    System.out.println("Tienes "+p2.hijos+" hijos");
 }

    
}
