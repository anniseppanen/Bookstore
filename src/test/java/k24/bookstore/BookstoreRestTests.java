package k24.bookstore;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import k24.bookstore.domain.Book;
import k24.bookstore.domain.BookRepository;
import k24.bookstore.domain.Category;

@SpringBootTest
public class BookstoreRestTests {
    @Autowired 
    BookRepository bookRepository;
    @Autowired
    private WebApplicationContext webAppContext;
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
    }

    @Test
    public void responseTypeApplicationJson() throws Exception {
        mockMvc.perform(get("/books"))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
    }

    @Test
    public void statusOkWhenGetBook() throws Exception {
        mockMvc.perform(get("/books")).andExpect(status().isOk());
    }

    @Test
    public void statusOkWhenGetBookById() throws Exception {
        mockMvc.perform(get("/book/{id}", 1))
        .andExpect(status().isOk());
    }

    @Test
    public void statusOkWhenGetCategory() throws Exception {
        mockMvc.perform(get("/categories"))
        .andExpect(status().isOk());
    }


}