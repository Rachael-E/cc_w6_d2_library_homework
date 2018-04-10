import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.bookCollection = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int bookCount(){
        return bookCollection.size();
    }

    public void addBook(Book bookToAdd){
        if (bookCount() < this.capacity){
        bookCollection.add(bookToAdd);}
    }




}
