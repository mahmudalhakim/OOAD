package behavioral.strategy;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class OperationSubtract implements Strategy {
  @Override
  public int doOperation(int num1, int num2) {
    return num1 - num2;
  }
}
