package entites;

import javax.persistence.*;
import java.time.Year;
import java.util.UUID;

@Entity
public class Magazine extends Element{
    @Enumerated(EnumType.STRING)
    private Periodicity periodicity;

    public Magazine(String title, int pubblicationYear, long numberPages , Periodicity periodicity) {
        this.periodicity = periodicity;
        this.title = title;
        this.pubblicationYear = pubblicationYear;
        this.numberPages = numberPages;
    }

    public Magazine() {}

    public Magazine(String focus, int i, int numberPages, Periodicity periodicity) {
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "periodicity=" + periodicity +
                '}';
    }
}
