package POO.Ejercicio;

public class SmartDevice {
    // 1. atributos
    protected String marca;
    String modelo;
    String color;
    double precio;
    int año;

    // 2 Constructor
    public SmartDevice (){

    }
    public SmartDevice (String fabricante, String modelo, String color, double precio, int año){
        this.marca = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.año = año;

    }

}
