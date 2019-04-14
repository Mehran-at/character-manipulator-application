package charactermanipulator;

public class CharacterManipulatorApplication {
  public static void main(String[] args) {
    Manipulator manipulator = new Manipulator();
    Text text = new Text("sdfsgfvdsfsfdfgsfz");
    String reverse = manipulator.reverse(text);
    int i = manipulator.toASCII(reverse);
    manipulator.toLetter(i);

  }
}
