package POO.Ejercicio;

public class Main {
    public static void main(String[] args) {

        SmartPhone xiaomi = new SmartPhone("Xiaomi","redmi","verde",500.87,2020,true);
        System.out.println("Atributos del Smartphone Xiaomi");
        System.out.println(xiaomi.marca);
        System.out.println(xiaomi.modelo);
        System.out.println(xiaomi.color);
        System.out.println(xiaomi.año);
        System.out.println(xiaomi.precio);
        System.out.println(xiaomi.llamadas);

        SmartWatch apple = new SmartWatch("apple","Super Smarwatch","negro",1200.87,2021,true);
        System.out.println("\nAtributos del Smartwatch de apple");
        System.out.println(apple.marca);
        System.out.println(apple.modelo);
        System.out.println(apple.color);
        System.out.println(apple.precio);
        System.out.println(apple.precionCardiaca);
        System.out.println(apple.año);
    }
}
