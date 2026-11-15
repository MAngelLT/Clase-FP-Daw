package Relación_de_ejercicios.Ejercicio3.Prueba.src;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.empleado;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.sucursal;

public class trabaja {
    //Atributos
    private sucursal sucursal;
    private empleado empleado;
    private String dia;
    private String horario;

    //constructores
    public trabaja() {}

    public trabaja(sucursal sucursal, empleado empleado, String dia, String horario) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.dia = dia;
        this.horario = horario;
    }

    //getters y setters
    public sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    //métodos
    public void imprimir() {
        System.out.println("Empleado: " + this.empleado.getNombre() + " trabaja en Sucursal Nº: " + this.sucursal.getNumero());
        System.out.println("Día: " + this.dia + " // Horario: " + this.horario);
        System.out.println("-----------------------------------------------------------");
    }


    
}