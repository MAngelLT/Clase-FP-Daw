package Relación_de_ejercicios.Ejercicio1;

public class Pais {

    //Atributos 
    private String nombre;
    private int poblacion;
    private Double PIB;


    //Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public Double getPIB() {
        return PIB;
    }
    public void setPIB(Double PIB) {
        this.PIB = PIB;
    }

    //Constructor con parametros
    public Pais(String nombre, int poblacion,double PIB){
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.PIB=PIB;


    }


    //Método
    public void PIB_per_Capita(){
        double PIB_per_Capita=(this.PIB*100000)/this.poblacion;
        System.out.println("El PIB per Cápita es de "+PIB_per_Capita+" Euros");

    }

    public static void main(String[] args) {

        Pais espana=new Pais("España", 300000, 150000);
        Pais portugual=new Pais("Portugal",130000,300.20);
        System.out.println();
        espana.PIB_per_Capita();
        portugual.PIB_per_Capita();
        
    }
}
