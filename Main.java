package Seminar_3_Homework_Exceptions;

import javax.swing.text.View;

public class Main {
    public static void main(String[] args) {
        DisplayView<View> myprog = new DisplayView<>(new DataView());
        myprog.start();
    }
}

