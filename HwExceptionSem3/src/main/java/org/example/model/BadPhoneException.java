package org.example.model;

public class BadPhoneException extends  Exception{
    String inputString;

    public BadPhoneException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Не удалось преобразовать " + inputString + " в телефонный номер, (нужен формат телефона 10 цифр без разделителей (0123456789))\n";
    }
}
