/**
 * Created by Mahmud Al Hakim
 * Project: OOAD - Class Diagram
 * Copyright: MIT
 */
public class CarDemo {
  public static void main(String[] args) {

    // Skapa några objekt (instanser)
    Car car1 = new Car();
    Car car2 = new Car();

    // Arbeta med instansvariabler (egenskaper)
    car1.model = "Volvo";
    car1.year = 2020;
    car1.price = 350_000;

    car2.model = "Saab";
    car2.price = 250_000;

    System.out.printf("%s kostar %,d kr \n", car1.model , car1.price);
    System.out.printf("%s kostar %,d kr \n", car2.model , car2.price);

  }
}
