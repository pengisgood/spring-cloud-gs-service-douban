package me.maxpeng.gs.services;

import me.maxpeng.gs.models.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookService {

  @Value("${book.isbn}")
  private String ISBN_API;

  public Book findByISBN(String isbn) {
    return Book.builder().title("hello").subTitle("world").build();
  }
}
