package es.cfuent.documents_manager.models;

public class Document {

    private String id;
    private String author;
    private String title;
    private String description;
    private String content;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document [id=" + id + ", author=" + author + ", title=" + title + ", description=" + description
                + ", content=" + content + "]";
    }
    
}
