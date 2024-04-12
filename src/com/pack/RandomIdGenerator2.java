package com.pack;

import java.security.SecureRandom;
import java.util.Locale;

public class RandomIdGenerator2 {

  private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static final SecureRandom secureRandom = new SecureRandom();

  public static void main(String[] args) {
    String randomId = generateRandomId(8);
    System.out.println(randomId);
  }

  public static String generateRandomId(int length) {
    StringBuilder builder = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      builder.append(ALPHABET.charAt(secureRandom.nextInt(ALPHABET.length())));
    }
    return builder.toString();
  }
}

