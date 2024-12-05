package structural.facade;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("This is a Rectangle!");
  }
}
