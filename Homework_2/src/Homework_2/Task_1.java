package Homework_2;


import org.json.JSONArray;
import org.json.JSONObject;

public class Task_1 {
    // Задание 1 - Дана строка sql-запроса "select * from students where ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json строки.
//        Если значение null, то параметр не должен попадать в запрос.
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//        (Не sql запрос, я оговорился на вебинаре!)
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика
//        Студент Петрова получил 4 по предмету Информатика.
//                Студент Краснов получил 5 по предмету Физика.

    String s = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    JSONArray jsonarray = new JSONArray(s);
    StringBuilder stringBuilder = new StringBuilder();


    public void parsAndPrint() {
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            stringBuilder.append("Студент ")
                    .append(jsonobject.getString("фамилия"))
                    .append(" получил ")
                    .append(jsonobject.getString("оценка"))
                    .append(" по предмету ")
                    .append(jsonobject.getString("предмет"))
                    .append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
