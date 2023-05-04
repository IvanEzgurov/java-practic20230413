package HomeWork5;

import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        //exe5_1();
        exe5_2();

    }


    //Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

    private static void exe5_1() {
        Map<String, String> peoples = new HashMap<>();
        peoples.put("1234", "Иванов");
        peoples.put("4321", "Иванов");
        peoples.put("4563", "Скворцов");
        peoples.put("5612", "Сидоров");

        for (Map.Entry<String, String> entry : peoples.entrySet()) {
            System.out.printf("%s\t -> \t%s%n", entry.getKey(), entry.getValue());


        }
        System.out.println();
        // Поиск номеров телефонов по имени:
        for (Map.Entry<String, String> entry : peoples.entrySet())
            if (entry.getValue().equals("Иванов")) {
                System.out.printf("%s\t -> \t%s%n", entry.getKey(), entry.getValue());
            }
    }
    //Пусть дан список сотрудников:
    // Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

    private static void exe5_2() {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        System.out.println(nameCounts);

        List<Map.Entry<String, Integer>> sortedNameCounts = new ArrayList<>(nameCounts.entrySet());
        Collections.sort(sortedNameCounts, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : sortedNameCounts) {
            if (entry.getValue() >= 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());

            }
        }

    }
    //На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

}