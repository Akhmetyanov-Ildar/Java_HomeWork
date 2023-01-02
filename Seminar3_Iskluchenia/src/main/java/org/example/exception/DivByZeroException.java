package org.example.exception;

public class DivByZeroException extends ArithmeticException{
    public DivByZeroException() {
        super("Divide by zero");
    }
}
