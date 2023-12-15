package entites;

import javax.persistence.*;
import java.time.Year;
import java.util.UUID;

@NamedQueries(@NamedQuery(name = "findByYear", query = "SELECT a FROM Element a WHERE a.pubblicationYear = :year"))
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Element {
    @Id
    @GeneratedValue
    protected UUID ISBN;
    protected String title;
    protected int pubblicationYear;
    protected long numberPages;

    public Element(String title, int pubblicationYear, long numberPages) {
        this.title = title;
        this.pubblicationYear = pubblicationYear;
        this.numberPages = numberPages;
    }

    public Element() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPubblicationYear() {
        return pubblicationYear;
    }

    public void setPubblicationYear(int pubblicationYear) {
        this.pubblicationYear = pubblicationYear;
    }

    public long getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(long numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Element{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", pubblicationYear=" + pubblicationYear +
                ", numberPages=" + numberPages +
                '}';
    }
}
