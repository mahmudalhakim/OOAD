package behavioral.strategy.exercise.solution;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class DES implements EncryptionAlgorithm {
  @Override
  public String encrypt(String text) {
    System.out.println("Encrypting message using DES");
    return "encryptedText";
  }
}
