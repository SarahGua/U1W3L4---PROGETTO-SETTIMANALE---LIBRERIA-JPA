package entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Books extends Element{
    private String author;
    private String genre;

    public Books(String title, String pubblicationYear, long numberPages, String author, String genre) {
        super();
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.pubblicationYear = pubblicationYear;
        this.numberPages = numberPages;
    }

    public Books() {}
}
