package behavioral.strategy.exercise.solution;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class ChatClient {

  private EncryptionAlgorithm encryptionAlgorithm;

  public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }

  public void send(String message) {
    String encryptedMessage = encryptionAlgorithm.encrypt(message);
    System.out.println("Sending the encrypted message...");
  }
}

