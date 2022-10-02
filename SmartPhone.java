package POO.Ejercicio;

public class SmartPhone extends SmartDevice{

    boolean llamadas;
    public SmartPhone (){

    }

    public SmartPhone(String fabricante, String modelo, String color, double precio, int año, boolean llamadas) {
        super(fabricante, modelo, color, precio, año);
        this.llamadas = llamadas;
    }
}
