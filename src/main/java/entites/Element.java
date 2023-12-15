package entites;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Element {
    @Id
    @GeneratedValue
    UUID ISBN;
    protected String title;
    protected String pubblicationYear;
    protected long numberPages;

    public Element(String title, String pubblicationYear, long numberPages) {
        this.title = title;
        this.pubblicationYear = pubblicationYear;
        this.numberPages = numberPages;
    }

    public Element() {}
}
