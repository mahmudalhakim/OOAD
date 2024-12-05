package creational.singleton;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class SingleObjectDemo {

  public static void main(String[] args) {

    SingleObject object1 = SingleObject.getInstance();
    SingleObject object2 = SingleObject.getInstance();

    System.out.println(object1 == object2); // true

    object1.getMessage();
    object2.getMessage();


  }
}
