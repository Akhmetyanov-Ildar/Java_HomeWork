package org.example.model;

public class BadBirthDateException extends Exception{
    String inputString;

    public BadBirthDateException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Ошибка при вводе даты '" + inputString + "', требуется формат 'дд.мм.гггг'. \n";
    }
}
