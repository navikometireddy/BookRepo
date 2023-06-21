package com.iceze.library.service;

import com.iceze.library.exception.BookNotFoundException;
import com.iceze.library.model.dto.BookDTO;

/**
 *  @Author navaneeswar
 *  * BookService
 */
public interface BookService {
    BookDTO retrieveBook(String bookReference) throws BookNotFoundException;
    String getBookSummary(String bookReference) throws BookNotFoundException;
}
