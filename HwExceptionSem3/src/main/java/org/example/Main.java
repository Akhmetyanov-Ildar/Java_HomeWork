package org.example;

import org.example.presenter.Presenter;
import org.example.view.ConsoleView;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        Presenter<View> presenter = new Presenter<>(new ConsoleView());
        presenter.start();



    }
}