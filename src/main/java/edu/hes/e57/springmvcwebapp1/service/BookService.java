package edu.hes.e57.springmvcwebapp1.service;

import edu.hes.e57.springmvcwebapp1.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();

    Book findBookById(Integer id);

    Book saveBook(Book book);

    Page<Book> findAllByPage(Pageable pageable);

}
