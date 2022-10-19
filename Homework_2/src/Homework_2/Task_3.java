package Homework_2;

import java.io.File;
import java.util.Locale;

//������� 3 - �������� �����, ������� ��������� ���
// (����������) ������ �� ������� ����� � ������� � ������� ��������� ����
//1 ���������� �����: txt
//2 ���������� �����: pdf
//3 ���������� �����:
//4 ���������� �����: jpg
public class Task_3 {

    public String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }
}
