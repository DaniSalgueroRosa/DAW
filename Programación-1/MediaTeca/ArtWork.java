
import java.time.LocalDate;

public class ArtWork{
    private String title;
    private LocalDate publishDate;

    public ArtWork(LocalDate publishDate, String title) {
        this.publishDate = publishDate;
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    

}