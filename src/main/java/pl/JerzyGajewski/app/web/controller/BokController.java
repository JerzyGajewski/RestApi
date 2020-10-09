package pl.JerzyGajewski.app.web.controller;

import org.springframework.web.bind.annotation.*;
import pl.JerzyGajewski.app.web.book.Book;
import pl.JerzyGajewski.app.web.service.MemoryBookService;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BokController {

   private MemoryBookService memoryBookService;

    public BokController(MemoryBookService memoryBookService) {
        this.memoryBookService = memoryBookService;
    }

    @GetMapping("")
    public Collection<Book> getAllBooks(){
        return memoryBookService.findAll();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return memoryBookService.findById(id);
    }
    @PutMapping("/{id}")
    public Book update (@PathVariable Long id, Book book){
        return memoryBookService.update(id, book);
    }
    @DeleteMapping("/{id}")
    public Book delete(@PathVariable Long id){
        return memoryBookService.deleteById(id);
    }
    @PostMapping("")
    public void addBook(Book book){
        memoryBookService.addBook(book);
    }

}
