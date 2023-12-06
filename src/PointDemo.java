
/**
 * Created by Mahmud Al Hakim
 * Project: OOAD - Class Diagram
 * Copyright: MIT
 */
public class PointDemo {
  public static void main(String[] args) {

    // Skapa några punkter
    Point p1 = new Point();
    p1.setX(1);
    p1.setY(2);

    Point p2 = new Point(3, 4);

    // Skriv ut punkterna
    p1.print();
    p2.print();

    // Beräkna avståndet mellan p1 och p2
    double d = Point.distance(p1, p2);
    System.out.printf("Avstånd = %.2f \n", d);

    // Beräkna mittpunkten
    Point midpoint = Point.midPoint(p1, p2);
    System.out.print("Mittpunkten är ");
    midpoint.print();

  }

  }