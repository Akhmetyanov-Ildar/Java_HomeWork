package Seminar_3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
//        Logger l = Logger.getAnonymousLogger();

//        ���� ��������� ������, c������� �� �
//        ������� == � ������ equals() ������ Object
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//        System.out.println(s1.equals(s5));
//        System.out.println(s1 == s6);
//        System.out.println(s3.equals(s6));

//        Random random = new Random();
//        List list = new ArrayList<>();
//        list.add(random.nextInt(1,100));
//        list.add(random.nextInt(1,100));
//        list.add(random.nextInt(1,100));
//        list.add(random.nextInt(1,100));
//        list.add(random.nextInt(1,100));
//        list.add(random.nextInt(1,100));
//        System.out.println(list);
//        list.sort(Comparator.naturalOrder());
//        System.out.println(l.getLevel());
        // ������ ����� -> ����� �� "�� �� ��" _> "�� �� �� "
//
//        System.out.println(RevereseWords("���� ��� ��� ������"));
//    }
//
//    public static String RevereseWords(String sentce) {
//        String[] words = sentce.split(" ");
//        StringBuilder answer = new StringBuilder();
//        for (int i = words.length-1; i >=0 ; i--) {
//            answer.append(words[i]+" ");
//        }
//        return answer.toString().trim();

//        ��������� ������ ���������� ������ ��������� ������� �
//        ������������ ������� � ������������. ������� ��������
//        ������ ������� � ���������� ��� ���������� � �����
//        ArrayList<String> planet = new ArrayList<String>();
//        planet.add("����");
//        planet.add("������");
//        planet.add("�����");
//        planet.add("����");
//        planet.add("����");
//        planet.add("����");
//         for (int i = 0; i < planet.size()-1; i++) {
//            if (planet.get(i).equals(planet.get(i + 1))) {
//
//            }
//        }
//        System.out.println(count);

//        ������� ������ ���� ArrayList. ��������� � ���� ��� ������,
//                ��� � ����� �����. ������ �� ������, ����� � ������� ����� �����.
        ArrayList<String> planet = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        planet.add("����");
        planet.add("���");
        planet.add("���");
        planet.add("1");
        planet.add("2");
        planet.add("3");

        for (String word: planet) {
            if (!word.matches("-?\\d+(\\.\\d+)?")) {
                list.add(word);
            }
        }
        System.out.println(list);

        }
//    public static boolean isNumeric(String str) {
//        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
//    }


}





