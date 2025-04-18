package es.cfuent.documents_manager.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;        

public class Author {

    private String id;
    private String name;
    private String email;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }       
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
    
}
