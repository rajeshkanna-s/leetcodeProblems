package com.pack;

import java.util.UUID;

public class RandomIdGenerator {

  public static void main(String[] args) {
    UUID uuid = UUID.randomUUID();
    String randomId = uuid.toString();
    System.out.println(randomId);
  }
}
