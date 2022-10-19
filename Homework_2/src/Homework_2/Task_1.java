package Homework_2;


import org.json.JSONArray;
import org.json.JSONObject;

public class Task_1 {
    // ������� 1 - ���� ������ sql-������� "select * from students where ".
//        ����������� ����� WHERE ����� �������, ��������� StringBuilder.
//        ������ ��� ���������� ��������� ���� � ���� json ������.
//        ���� �������� null, �� �������� �� ������ �������� � ������.
//[{"�������":"������","������":"5","�������":"����������"},{"�������":"�������","������":"4","�������":"�����������"},{"�������":"�������","������":"5","�������":"������"}]
//        �������� �����(�), ������� ��������� json �, ��������� StringBuilder, ������� ������ ����: ������� [�������] ������� [������] �� �������� [�������].
//        (�� sql ������, � ���������� �� ��������!)
//        ������ ������:
//        ������� ������ ������� 5 �� �������� ����������
//        ������� ������� ������� 4 �� �������� �����������.
//                ������� ������� ������� 5 �� �������� ������.

    String s = "[{\"�������\":\"������\",\"������\":\"5\",\"�������\":\"����������\"},{\"�������\":\"�������\",\"������\":\"4\",\"�������\":\"�����������\"},{\"�������\":\"�������\",\"������\":\"5\",\"�������\":\"������\"}]";

    JSONArray jsonarray = new JSONArray(s);
    StringBuilder stringBuilder = new StringBuilder();


    public void parsAndPrint() {
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            stringBuilder.append("������� ")
                    .append(jsonobject.getString("�������"))
                    .append(" ������� ")
                    .append(jsonobject.getString("������"))
                    .append(" �� �������� ")
                    .append(jsonobject.getString("�������"))
                    .append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
