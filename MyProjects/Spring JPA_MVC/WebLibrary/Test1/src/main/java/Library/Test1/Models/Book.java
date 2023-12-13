package Library.Test1.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;



@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "Введите название книги*")
    private String title;
    @NotEmpty(message = "Введите автора*")
    private String author;
    @NotEmpty(message = "Введите дату написания*")
    private String dateOfWright;
    @NotEmpty(message = "Введите кол-во страниц*")
    private String size;

}
