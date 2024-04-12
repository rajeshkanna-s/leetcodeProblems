package com.JavaProgram;

import java.util.Random;

public class ZezhaEncryptor {
    public static void main(String[] args) {
        String input = "Password@1235692819298292";
        String encrypted = encrypt(input);
        System.out.println("Encrypted: " + encrypted);
    }

    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int encryptedValue = getNumericValue(c);
            encryptedValue += 11; // Divide by 11

            if (encryptedValue > 65) {
                encryptedValue /= 3; // Divide by 3 again if greater than 65
            }

            char encryptedChar = getCharacter(encryptedValue);
            encrypted.append(encryptedChar);
        }
        System.out.println("FIRST STAGE ENCRYPT=="+encrypted.toString());
        String FinalEnc = generateRandomLetters(encrypted.toString());
        
        
        return FinalEnc;
    }

    public static int getNumericValue(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
            case 'K':
                return 11;
            case 'L':
                return 12;
            case 'M':
                return 13;
            case 'N':
                return 14;
            case 'O':
                return 15;
            case 'P':
                return 16;
            case 'Q':
                return 17;
            case 'R':
                return 18;
            case 'S':
                return 19;
            case 'T':
                return 20;
            case 'U':
                return 21;
            case 'V':
                return 22;
            case 'W':
                return 23;
            case 'X':
                return 24;
            case 'Y':
                return 25;
            case 'Z':
                return 26;
            case 'a':
                return 27;
            case 'b':
                return 28;
            case 'c':
                return 29;
            case 'd':
                return 30;
            case 'e':
                return 31;
            case 'f':
                return 32;
            case 'g':
                return 33;
            case 'h':
                return 34;
            case 'i':
                return 35;
            case 'j':
                return 36;
            case 'k':
                return 37;
            case 'l':
                return 38;
            case 'm':
                return 39;
            case 'n':
                return 40;
            case 'o':
                return 41;
            case 'p':
                return 42;
            case 'q':
                return 43;
            case 'r':
                return 44;
            case 's':
                return 45;
            case 't':
                return 46;
            case 'u':
                return 47;
            case 'v':
                return 48;
            case 'w':
                return 49;
            case 'x':
                return 50;
            case 'y':
                return 51;
            case 'z':
                return 52;
            case '~':
                return 53;
            case '!':
                return 54;
            case '@':
                return 55;
            case '#':
                return 56;
            case '$':
                return 57;
            case '%':
                return 58;
            case '^':
                return 59;
            case '&':
                return 60;
            case '*':
                return 61;
            case '(':
                return 62;
            case ')':
                return 63;
            case '.':
                return 64;
            case '/':
                return 65;
            default:
                return 0;
        }
    }

    public static char getCharacter(int numericValue) {
        switch (numericValue) {
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'H';
            case 9:
                return 'I';
            case 10:
                return 'J';
            case 11:
                return 'K';
            case 12:
                return 'L';
            case 13:
                return 'M';
            case 14:
                return 'N';
            case 15:
                return 'O';
            case 16:
                return 'P';
            case 17:
                return 'Q';
            case 18:
                return 'R';
            case 19:
                return 'S';
            case 20:
                return 'T';
            case 21:
                return 'U';
            case 22:
                return 'V';
            case 23:
                return 'W';
            case 24:
                return 'X';
            case 25:
                return 'Y';
            case 26:
                return 'Z';
            case 27:
                return 'a';
            case 28:
                return 'b';
            case 29:
                return 'c';
            case 30:
                return 'd';
            case 31:
                return 'e';
            case 32:
                return 'f';
            case 33:
                return 'g';
            case 34:
                return 'h';
            case 35:
                return 'i';
            case 36:
                return 'j';
            case 37:
                return 'k';
            case 38:
                return 'l';
            case 39:
                return 'm';
            case 40:
                return 'n';
            case 41:
                return 'o';
            case 42:
                return 'p';
            case 43:
                return 'q';
            case 44:
                return 'r';
            case 45:
                return 's';
            case 46:
                return 't';
            case 47:
                return 'u';
            case 48:
                return 'v';
            case 49:
                return 'w';
            case 50:
                return 'x';
            case 51:
                return 'y';
            case 52:
                return 'z';
            case 53:
                return '~';
            case 54:
                return '!';
            case 55:
                return '@';
            case 56:
                return '#';
            case 57:
                return '$';
            case 58:
                return '%';
            case 59:
                return '^';
            case 60:
                return '&';
            case 61:
                return '*';
            case 62:
                return '(';
            case 63:
                return ')';
            case 64:
                return '.';
            case 65:
                return '/';
            default:
                return ' ';
        }
    }
    
    public static String generateRandomLetters(String name) {
        StringBuilder randomLetters = new StringBuilder();
        Random random = new Random();
        String availableLetters = "AKASH";
        int availableLettersLength = availableLetters.length();
        int minLetters = 50;
        int maxLetters = 50;
        int totalLetters = random.nextInt(maxLetters - minLetters + 1) + minLetters; // Generate a random number between minLetters and maxLetters
        for (int i = 0; i < totalLetters; i++) {
            int randomIndex = random.nextInt(availableLettersLength);
            char randomLetter = availableLetters.charAt(randomIndex);
            randomLetters.append(randomLetter);
        }
        return randomLetters.toString();
    }
    
}


