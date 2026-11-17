package Relación_de_ejercicios.Ejercicio3.Prueba.src;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.producto;
import Relación_de_ejercicios.Ejercicio3.Ejercicio3.src.sucursal;

public class vende {
    //Atributos
    private sucursal sucursal;
    private producto producto;
    private double precioVenta;

    //constructores
    public vende() {}

    public vende(sucursal sucursal, producto producto, double precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }

    //getters y setters
    public sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public producto getProducto() {
        return producto;
    }
    public void setProducto(producto producto) {
        this.producto = producto;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    //métodos
    public void imprimir() {
        System.out.println("Número de sucursal: " + this.sucursal.getNumero() );
        System.out.println("vende el producto: " + this.producto.getDescripcion() );
        System.out.println("Precio de venta : " + this.precioVenta);
        System.out.println("-----------------------------------------------------------" );
    }
    
}
