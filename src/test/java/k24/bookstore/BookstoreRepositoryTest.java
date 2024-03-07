package k24.bookstore;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import k24.bookstore.domain.Book;
import k24.bookstore.domain.BookRepository;

@DataJpaTest
public class BookstoreRepositoryTest {
    @Autowired
    BookRepository bookRepository;
    
    @Test
    public void saveBook() {
        Book book = new Book();
        bookRepository.save(book);
        assertNotEquals(book.getId(), null);
    }

    @Test
    public void updateBook() {
        Optional<Book> book = bookRepository.findById((long) 1);
        assertNotEquals(book.get().getId(), null);
        Long oldId = book.get().getId();
        book.get().setId(2L);
        assertNotEquals(book.get().getId(), oldId);
    }
}
