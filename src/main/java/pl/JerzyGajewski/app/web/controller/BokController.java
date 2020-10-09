package pl.JerzyGajewski.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.JerzyGajewski.app.web.book.Book;

@RestController
@RequestMapping("/books")
public class BokController {

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1l, "142342", "Thinking in java",
                "Bruce Eckel", "Helion", "programing");
    }
}
