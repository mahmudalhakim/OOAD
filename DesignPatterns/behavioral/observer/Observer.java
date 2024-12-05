package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public abstract class Observer {
  protected Subject subject;

  public abstract void update();
}
