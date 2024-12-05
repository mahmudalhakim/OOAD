package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class Pepsi extends ColdDrink {
  @Override
  public String name() {
    return "Pepsi";
  }

  @Override
  public double price() {
    return 35;
  }
}
