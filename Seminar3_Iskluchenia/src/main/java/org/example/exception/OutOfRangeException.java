package org.example.exception;

public class OutOfRangeException extends ArrayIndexOutOfBoundsException{
    public OutOfRangeException() {
        super("Index out of range");
    }
}
