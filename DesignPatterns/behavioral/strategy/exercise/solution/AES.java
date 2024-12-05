package behavioral.strategy.exercise.solution;

/**
 * Created by Mahmud Al Hakim
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class AES implements EncryptionAlgorithm {
  @Override
  public String encrypt(String text) {
    System.out.println("Encrypting message using AES");
    return "encryptedText";
  }
}
