package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();
        System.out.println("Enter retangle width e height: ");
        retangle.height = sc.nextDouble();
        retangle.width = sc.nextDouble();

        System.out.println(retangle);






    }
}
