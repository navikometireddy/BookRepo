package com.iceze.library.dao;

import com.iceze.library.model.entity.BookEntity;

import java.util.Optional;

/**
 * @Author Navaneeswar
 *
 */
public interface BookRepository {
    Optional<BookEntity> retrieveBook(String reference);
}
