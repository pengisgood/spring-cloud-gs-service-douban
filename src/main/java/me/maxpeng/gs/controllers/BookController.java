package me.maxpeng.gs.controllers;

import me.maxpeng.gs.models.Book;
import me.maxpeng.gs.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
  @Autowired
  private BookService bookService;

  @GetMapping("/{isbn}")
  public ResponseEntity<Book> getBooks(@PathVariable String isbn){
    Book book = bookService.findByISBN(isbn);

    return new ResponseEntity<>(book, HttpStatus.OK);
  }
}
