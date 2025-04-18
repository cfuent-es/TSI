package es.cfuent.documents_manager.persistence;

import java.util.ArrayList;
import java.util.List;

import es.cfuent.documents_manager.models.Author;
import es.cfuent.documents_manager.models.Document;

public class DataBase {

    private static List<Author> authors = new ArrayList<Author>();
    private List<Document> documents = new ArrayList<Document>();
    
    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addDocument(Document document) {
        documents.add(document);
    }
    public List<Document> getDocuments() {
        return documents;
    }
    
}
