// StaticTest.java
import java.util.*	;

class Letter{
static char z='a';
}

public class StaticTest{
  public static void main(String[] args) {
    Letter z1 = new Letter();
    Letter z2 = new Letter();
    z1.z='b';
    z2.z='c';
    System.out.println("Letter1 :"+z1.z);
    System.out.println("Letter2 :"+z2.z);
    // Nur das Klassenelement wird geändert
    Letter.z='d';
    System.out.println("Letter1 :"+z1.z);
    System.out.println("Letter2 :"+z2.z);

    }
  }
