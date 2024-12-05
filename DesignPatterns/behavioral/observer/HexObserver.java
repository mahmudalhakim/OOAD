package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class HexObserver extends Observer {

  public HexObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Hex: " + Integer.toHexString(subject.getState()).toUpperCase());
  }
}
