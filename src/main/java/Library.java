import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> bookCollection;

    public Library(String name){
        this.name = name;
        this.bookCollection = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int bookCount(){
        return bookCollection.size();
    }

    public void addBook(Book bookToAdd){
        bookCollection.add(bookToAdd);
    }


}
