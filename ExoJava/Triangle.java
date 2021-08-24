package ExoJava;

import java.util.Collections;
import java.util.Scanner;


public class Triangle {


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int row = 0;
    int saisie = row;

    System.out.println("Combien de ligne ?");
    row = sc.nextInt();
    System.out.println("\n\nPour "+ row + " lignes\n");

    for(int i = 0; i < row; i++) {
      System.out.println(String.join("", Collections.nCopies(row - i - 1, " ")) + String.join("", Collections.nCopies(2 * i + 1, "*")));
    }


  }
}
