package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class ChickenBurger extends Burger {
  @Override
  public String name() {
    return "Chicken Burger";
  }

  @Override
  public double price() {
    return 50;
  }
}
