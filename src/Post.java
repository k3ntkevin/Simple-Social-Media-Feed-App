import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post implements Serializable {
    private String user;
    private String content;
    private LocalDateTime timestamp;

    public Post(String user, String content) {
        this.user = user;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getUser() { return user; }
    public String getContent() { return content; }

    public String getFormattedTimestamp() {
        return timestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    @Override
    public String toString() {
        return "[" + getFormattedTimestamp() + "] " + user + ": " + content;
    }
}
