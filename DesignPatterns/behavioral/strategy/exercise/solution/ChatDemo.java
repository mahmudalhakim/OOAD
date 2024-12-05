package behavioral.strategy.exercise.solution;

/**
 * Created by Mahmud Al Hakim
 * Copyright: MIT
 */
public class ChatDemo {

  public static void main(String[] args) {

    var client1 = new ChatClient(new DES());
    client1.send("Hello World");

    var client2 = new ChatClient(new AES());
    client2.send("Hello World");
  }
}
