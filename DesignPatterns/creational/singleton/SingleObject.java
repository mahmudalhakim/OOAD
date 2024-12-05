package creational.singleton;

import java.util.Random;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class SingleObject {

  private static final SingleObject instance = new SingleObject();
  private int random = new Random().nextInt(100);

  private SingleObject() {
  }

  public static SingleObject getInstance(){
    return instance;
  }

  public void getMessage(){
    System.out.println("My random number is " + this.random);
  }


}
