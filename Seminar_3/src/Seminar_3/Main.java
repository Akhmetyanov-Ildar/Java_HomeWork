package Seminar_3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
//        Logger l = Logger.getAnonymousLogger();

//        Даны следующие строки, cравнить их с
//        помощью == и метода equals() класса Object
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
        // массив чаров -> слова из "Ан гл ия" _> "яи гл Ан "
//
//        System.out.println(RevereseWords("Один Два Три Четыре"));
//    }
//
//    public static String RevereseWords(String sentce) {
//        String[] words = sentce.split(" ");
//        StringBuilder answer = new StringBuilder();
//        for (int i = words.length-1; i >=0 ; i--) {
//            answer.append(words[i]+" ");
//        }
//        return answer.toString().trim();

//        Заполнить список названиями планет Солнечной системы в
//        произвольном порядке с повторениями. Вывести название
//        каждой планеты и количество его повторений в списк
//        ArrayList<String> planet = new ArrayList<String>();
//        planet.add("марс");
//        planet.add("венерв");
//        planet.add("земля");
//        planet.add("луна");
//        planet.add("марс");
//        planet.add("луна");
//         for (int i = 0; i < planet.size()-1; i++) {
//            if (planet.get(i).equals(planet.get(i + 1))) {
//
//            }
//        }
//        System.out.println(count);

//        Создать список типа ArrayList. Поместить в него как строки,
//                так и целые числа. Пройти по списку, найти и удалить целые числа.
        ArrayList<String> planet = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        planet.add("один");
        planet.add("два");
        planet.add("три");
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





