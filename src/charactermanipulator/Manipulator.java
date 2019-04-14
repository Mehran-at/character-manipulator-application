package charactermanipulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Manipulator {

  public String reverse(Text text) {
    String textContent = text.getText();
    String[] split = textContent.split("");
    List<String> letters = new ArrayList<>(Arrays.asList(split));
    Collections.reverse(letters);
    String reversed = "";
    for (String letter : letters) {
      reversed += letter;
    }
    System.out.println(reversed);
    return reversed;
  }

  public int toASCII(String letter) {
    char character = letter.charAt(0);
    int asciiCode = character;
    System.out.println("ASCII Code for the letter " + character + " is: " + asciiCode);
    return asciiCode;
  }

  public String toLetter(int asciiCode) {
    char character = (char) asciiCode;
    String stringToAsciiValue = String.valueOf(character);
    System.out.println("The value of ASCII Code for the last letter of that text is: " + stringToAsciiValue);
    return stringToAsciiValue;
  }
}
