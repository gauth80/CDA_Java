
package ExoJava;
import java.util.Scanner;

public class Exo {



  public static void main(String[] args) {
    double entryValue;

    Scanner sc = new Scanner(System.in);
    System.out.println("indiquez la valeur de départ");
    entryValue = sc.nextDouble();
    System.out.println("Ceci donne : " + celcius(entryValue));

  }

  static double celcius(double f) {
    // cast le resultat, histoire d'arrondir
    return (int)(f-32)*5/9;
  }

}
