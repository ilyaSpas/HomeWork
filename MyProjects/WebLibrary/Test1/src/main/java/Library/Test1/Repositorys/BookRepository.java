package Library.Test1.Repositorys;


import Library.Test1.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
