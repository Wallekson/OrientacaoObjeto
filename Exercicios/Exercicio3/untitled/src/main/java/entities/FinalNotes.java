package entities;

public class FinalNotes {

    public String name;

    public double note1, note2, note3;


    public double TotalNotes() {
        return note1 + note2 + note3;
    }

    public double missingPoints() {
        if (TotalNotes() < 60) {
            return 60.0 - TotalNotes();
        } else {
            return 0.0;
        }

    }


}
