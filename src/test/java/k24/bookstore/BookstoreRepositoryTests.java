package k24.bookstore;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import k24.bookstore.domain.AppUser;
import k24.bookstore.domain.AppUserRepository;
import k24.bookstore.domain.Book;
import k24.bookstore.domain.BookRepository;
import k24.bookstore.domain.Category;
import k24.bookstore.domain.CategoryRepository;

@DataJpaTest
public class BookstoreRepositoryTests {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AppUserRepository appUserRepository;

    // BookRepository tests
    @Test
    public void findAllNotEmpty() {
        assertThat(bookRepository.findAll()).isNotEmpty();
    }

    @Test
    public void deleteBook() {
        bookRepository.deleteById(1L);
        assertThat(bookRepository.findById(1l)).isEmpty();
    }

    @Test
    public void addBook() {
        Book book = new Book("New book", "Author", 2024, "ISBN", 10.0, null);
        bookRepository.save(book);
        assertThat(bookRepository.findById(book.getId())).isPresent();
    }

    // CategoryRepository tests
    @Test
    public void findByNameReturnsList() {
        List<Category> books = categoryRepository.findByName("Horror");
        assertThat(books).hasSize(1);
    }

    @Test
    public void saveCategory() {
        Category category = new Category("Comdey");
        categoryRepository.save(category);
        assertNotNull(categoryRepository.findByName(category.getName()));
    }

    @Test 
    public void deleteCategory() {
        categoryRepository.deleteById(1L);
        assertThat(categoryRepository.findById(1L)).isEmpty();
    }

    // AppUserRepository tests
    @Test
    public void findByUserNameReturnsUser() {
        AppUser appUser = appUserRepository.findByUsername("admin");
        assertNotNull(appUser.getId());
    }
    
}
