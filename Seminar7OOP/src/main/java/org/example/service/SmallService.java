package org.example.service;

public class SmallService implements IStudentLearn{
    @Override
    public void learn() {
        System.out.println("Я люблю учиться");
    }

    public void cry(){
        System.out.println("Хочу к маме");
    }
}
