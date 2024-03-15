package k24.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import k24.bookstore.domain.AppUser;
import k24.bookstore.domain.AppUserRepository;
import k24.bookstore.domain.Book;
import k24.bookstore.domain.BookRepository;
import k24.bookstore.domain.Category;
import k24.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	/* 
	@Bean
	public CommandLineRunner demo(BookRepository bookRepository, CategoryRepository categoryRepository, AppUserRepository appUserRepository) {
		return (args) -> {
			Category category1 = new Category("Horror");
			Category category2 = new Category("Romance");
			Category category3 = new Category("Thriller");

			categoryRepository.save(category1);
			categoryRepository.save(category2);
			categoryRepository.save(category3);
			
			bookRepository.save(new Book("Varjostus", "Max Mensson", 1990, "1234", 20.00, category1));
			bookRepository.save(new Book("Varjostus2", "Max Mensson",1990, "1234", 20.00, category1));
			bookRepository.save(new Book("Varjostus3", "Max Mensson", 1990, "1234", 20.00, category1));

			AppUser user1 = new AppUser("user", "$2a$10$hMq6n3Y55lUiakJ.e.T/BeWfAXIt6aBcT4uyju3vHVyYAfLTz/tf.", "gmail", "USER");
			AppUser user2 = new AppUser("admin", "$2a$10$DuOjjQDWDTL7QX7Qxq3P3uovsAgGam4HAaUe9U0ETlOd9kiViE8rS", "gmail","ADMIN");
			appUserRepository.save(user1);
			appUserRepository.save(user2);
			
			for(Book book : bookRepository.findAll()) {
				System.out.println("Kirjan tiedot: " + book.toString());
			}
		};
	}*/

}
