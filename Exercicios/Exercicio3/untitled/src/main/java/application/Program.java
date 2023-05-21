package application;

import entities.FinalNotes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FinalNotes finalNotes = new FinalNotes();
        finalNotes.name = sc.nextLine();
        finalNotes.note1 = sc.nextDouble();
        finalNotes.note2 = sc.nextDouble();
        finalNotes.note3 = sc.nextDouble();

        System.out.printf("%.2f", finalNotes.TotalNotes());
        if (finalNotes.TotalNotes() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", finalNotes.missingPoints());
        }
        sc.close();


    }

}
