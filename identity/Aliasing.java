// Aliasing.java
import java.util.*	;

class Letter{
char z;
}

public class Aliasing{
  static void f(Letter y){
    y.z = 'z';
    }
  public static void main(String[] args) {
    Letter z1 = new Letter();
    Letter z2 = new Letter();
    z1.z	= 'a';
    z2.z	= 'b';
    System.out.println("Letter1 :"+z1.z);
    System.out.println("Letter2 :"+z2.z);
    f(z2);
    //f(z1);
    System.out.println("Letter1 :"+z1.z);
    System.out.println("Letter2 :"+z2.z);
    }
  }
