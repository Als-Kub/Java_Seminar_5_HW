/*
 Задание 1.
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.*;

public class Assignment_1 {
    public static void main(String[] args) {
        Map<String, List<String>> db = new HashMap<>();
        db.put("Иванов Тимофей", Arrays.asList("+79052976952", "79163457867", "+79037695115"));
        db.put("Васильев Евгений", Arrays.asList("+79162976952"));
        db.put("Петрова Анна", Arrays.asList("+79035118813, +79023459012"));
        db.put("Сидоров Олег", Arrays.asList("+79034481291"));
        db.put("Кундулаев Михаил", Arrays.asList("+79011234554, +79033486118"));
        db.put("Потапкина Алла", Arrays.asList("+79163314248"));

        System.out.printf("%-20s %50s %n", "Имя", "Телефон");
        for (var item : db.entrySet()) {
            // System.out.println(item.getKey()+" "+item.getValue());
            System.out.printf("%-20s %50s %n", item.getKey(), item.getValue());

        }

    }

}
