package pl.JerzyGajewski.app.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import pl.JerzyGajewski.app.web.book.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryBookService {
private Map<Long, Book> books = new HashMap<>();
private static Long nextId = 3l;

public MemoryBookService(){
    books.put(1l, new Book(1l,"2312", "Lord of the rings",
            "J.R.R. Tolkien", "Rebel", "fantasy"));
    books.put(2l, new Book(2l, "32456", "Thinking in java",
            "Bruce Eckel", "Helion", "programing"));
}

public void addBook(Book book){
book.setId(nextId++);
books.put(nextId, book);
}
public Collection<Book> findAll(){
    return books.values();
}

public Book findById(Long bookId){
    return books.get(bookId);
}

public Book deleteById(Long bookId){
    return books.remove(bookId);
}

public Book update (Long id, Book book){
    return books.put(id, book);
}
}
