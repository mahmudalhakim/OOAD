package creational.factory;

import java.util.Calendar;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class FactoryPatternDemo {

  public static void main(String[] args) {

    ShapeFactory shapeFactory = new ShapeFactory();


    Shape shape1 = shapeFactory.getShape("Square");
    Shape shape2 = shapeFactory.getShape("Circle");
    Shape shape3 = shapeFactory.getShape("Rectangle");

    shape1.draw();
    shape2.draw();
    shape3.draw();

    Shape shape4 = shapeFactory.getShape("rect");

    shape4.draw();

    var date1 = Calendar.getInstance();
    var date2 = Calendar.getInstance();
    System.out.println(date1 == date2); // false

  }
}
