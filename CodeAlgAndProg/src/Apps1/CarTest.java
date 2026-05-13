package Apps1;
import GeneralClasses.Car;
public class CarTest {
    public static void main(String[] args) {
        Car a1 = new Car(131, "XX", 0, 2023,1000);
        Car a2 = new Car(101, "ZZ", 158700, 2004, 20000);
        Car a3 = new Car(110, "YY", 8000, 2020, 30000);

        System.out.print("\nAuto " + a1);
        System.out.println("\nTotal a pagar: $" + a1.registraRenta("Juan", "cccc", 10));
        a1.devolucion(508.30);
        System.out.print("\nAuto " + a1);
    }
}
