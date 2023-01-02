package org.example.exception;

import java.io.FileNotFoundException;

public class FileOpenException extends FileNotFoundException {

    public FileOpenException(String s) {
        super("File not found");
    }
}
