import java.time.LocalDate;

public class Book extends ArtWork {
    public String publisher;
    private int pages;
  
    public Book(LocalDate publishDate, String title, String publisher, int pages) {
        super(publishDate, title);
        this.publisher = publisher;
        this.pages = pages;
    }

}