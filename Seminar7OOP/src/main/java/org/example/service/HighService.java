package org.example.service;

public class HighService implements IStudentLearn, IStudentSmoke {
    @Override
    public void learn() {
        System.out.println("Я должен учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю урок");
    }

    public void meet() {
        System.out.println("У меня есть подруга");
    }

    public void prepareExam() {
        System.out.println("Я готовлюсь к экзаменам");
    }
}
