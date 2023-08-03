package edu.hes.e57.springmvcwebapp1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import edu.hes.e57.springmvcwebapp1.entities.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

}
