import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library publicLibrary;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        publicLibrary = new Library("Mitchell Library", 2);
        book1 = new Book("The Hobbit");
        book2 = new Book("Name of the Wind");
        book3 = new Book("Gut");
    }

    @Test
    public void hasName(){
        assertEquals("Mitchell Library", publicLibrary.getName());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, publicLibrary.bookCount());
    }

    @Test
    public void canAddBook(){
        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        assertEquals(2, publicLibrary.bookCount());
    }

    @Test
    public void cantAddBook(){
        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        publicLibrary.addBook(book3);
        assertEquals(2, publicLibrary.bookCount());
    }

}
