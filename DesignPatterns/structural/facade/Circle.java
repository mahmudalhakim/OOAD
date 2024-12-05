package structural.facade;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("This is a circle!");
  }
}
