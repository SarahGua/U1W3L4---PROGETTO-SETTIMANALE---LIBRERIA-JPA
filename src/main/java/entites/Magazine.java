package entites;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Magazine extends Element{
    @Enumerated(EnumType.STRING)
    private Periodicity periodicity;

    public Magazine(UUID ISBN, String title, String pubblicationYear, long numberPages ,Periodicity periodicity) {
        this.periodicity = periodicity;
        this.title = title;
        this.pubblicationYear = pubblicationYear;
        this.numberPages = numberPages;
    }

    public Magazine() {}

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
