package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class BinaryObserver extends Observer {

  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Binary: " + Integer.toBinaryString(subject.getState()));
  }
}
