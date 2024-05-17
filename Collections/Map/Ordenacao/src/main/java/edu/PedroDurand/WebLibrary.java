package edu.PedroDurand;

import java.util.HashMap;
import java.util.Map;

public class WebLibrary {
    private Map<String, Book> bookMap;

    public WebLibrary() {
        this.bookMap = new HashMap<>();
    }

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void addBook(String link, String name, String author, double preco){
        bookMap.put(link, new Book(name, author, preco));
    }

    public void deleteBook(String name){
        for (Map.Entry<String, Book> m : bookMap.entrySet()){
            if(m.getValue().getName().equalsIgnoreCase(name)){
                bookMap.remove(m);
                break;
            }
        }
    }
}
