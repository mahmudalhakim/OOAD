package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class OctalObserver extends Observer {

  public OctalObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
  }
}
