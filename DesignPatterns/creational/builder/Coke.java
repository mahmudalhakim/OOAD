package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class Coke extends ColdDrink {
  @Override
  public String name() {
    return "Coke";
  }

  @Override
  public double price() {
    return 30;
  }
}
