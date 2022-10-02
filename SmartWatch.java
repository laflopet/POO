package POO.Ejercicio;

public class SmartWatch extends SmartDevice{

    boolean precionCardiaca;
    public SmartWatch (){

    }

    public SmartWatch (String fabricante, String modelo, String color, double precio, int año, boolean precionCardiaca){
        super(fabricante,modelo,color,precio,año);
        this.precionCardiaca = precionCardiaca;
    }
}
