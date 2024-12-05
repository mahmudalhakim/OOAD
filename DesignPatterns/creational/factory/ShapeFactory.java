package creational.factory;

import java.util.NoSuchElementException;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class ShapeFactory {

  public Shape getShape(String shapeType){

    if(shapeType.equalsIgnoreCase("Circle"))
      return new Circle();

    if(shapeType.equalsIgnoreCase("Rectangle"))
      return new Rectangle();

    if(shapeType.equalsIgnoreCase("Square"))
      return new Square();

    throw new NoSuchElementException("No Such Class Found");
    // return null;
  }
}
