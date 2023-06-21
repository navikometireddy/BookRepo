package com.iceze.library.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(final String e) {
        super(e);
    }
}
