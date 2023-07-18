package socmedSample;

import java.util.*;

class Post {
    private User author;
    private String content;
    private Date timestamp;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
