package es.cfuent.documents_manager.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import es.cfuent.documents_manager.models.Author;
import es.cfuent.documents_manager.models.Document;
import es.cfuent.documents_manager.persistence.DataBase;

@Controller
public class DocumentsController {
    
    private DataBase db = new DataBase();
    
    
    @GetMapping(value = "/documents")
    public String documents(Model model){
        List<Document> documents = db.getDocuments();
        model.addAttribute("documents", documents);
        return "documents/index";
    }

    @GetMapping(value = "/documents/create")
    public String create(Model model){
        List<Author> authors = db.getAuthors();
        model.addAttribute("authors", authors);
        return "documents/create";
    }

    @PostMapping(value = "/documents/create")
    public String store(Document document){
        document.setId(UUID.randomUUID().toString());
        db.addDocument(document);
        return "redirect:/documents";
    }
    

}
