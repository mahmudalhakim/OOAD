package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class VegBurger extends Burger {
  @Override
  public String name() {
    return "Veg Burger";
  }

  @Override
  public double price() {
    return 25;
  }
}
