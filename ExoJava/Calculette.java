
package ExoJava;
import java.util.Scanner;


public class Calculette {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float res;


      // input puis une Séquences, Input pui sequence, etc..
      System.out.println("entrez le premier chiffre.");
      float n1 = sc.nextFloat();
      System.out.println("entrez le signe.");
      String operateur = sc.next();
      System.out.println("entrez le second chiffre.");
      float n2 = sc.nextFloat();


      // choix
      switch (operateur) {
        case "+":
          res = n1 + n2;
          System.out.println(res);
          break;
        case "-":
          res = n1 - n2;
          System.out.println(res);
          break;
        case "*":
          res = n1 * n2;
          System.out.println(res);
          break;
        case "/":
          res = n1 / n2;
          System.out.println(res);
          break;
        default:
          System.out.println("erreur de valeur");

      }

  }
}
