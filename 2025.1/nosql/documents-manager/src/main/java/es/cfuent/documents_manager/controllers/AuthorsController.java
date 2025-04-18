package es.cfuent.documents_manager.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import es.cfuent.documents_manager.models.Author;
import es.cfuent.documents_manager.persistence.DataBase;

@Controller
public class AuthorsController {
    
    DataBase db = new DataBase();   
    
    @GetMapping(value = "/authors")
    public String authors(Model model){
        List<Author> authors = db.getAuthors();
        model.addAttribute("authors", authors);
        return "authors/index";
    }

    @GetMapping(value = "/authors/create")
    public String create(){
        return "authors/create";
    }

    @PostMapping(value = "/authors/create")
    public String store(Author author){
        author.setId(UUID.randomUUID().toString());
        System.out.println(author.toString());
        db.addAuthor(author);
        return "redirect:/authors";
    }

}
