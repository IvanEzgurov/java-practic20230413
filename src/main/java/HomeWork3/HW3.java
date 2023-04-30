package HomeWork3;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        //task3_1();
        //task3_2();
        task3_3();

    }


    //Создать cписок типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
//Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    private static void task3_1() {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Яблоко");
        elements.add("11");
        elements.add("13");
        elements.add("Апельсин");
        elements.add("Дыня");
        elements.add("17");
        System.out.println(elements);
        int i = 0;

        while (i< elements.size()){
            try {
                Integer.parseInt(elements.get(i));
                elements.remove(i);
            }catch (Exception e){
                i++;
            }
        }
        System.out.println(elements.toString());
    }

    // Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    // что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
    // Напишите метод для заполнения данной структуры(можно через консоль).
    //  Пример:
    //          "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
    //          "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
    //          "Детектив", "Десять негритят".
    //          "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
    private static void task3_2() {
        List<List<String>> arrBooks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите жанр книги: ");
            String bookGenre = scan.next().toLowerCase();
            System.out.println("Введите название книг и закончите введением 1: ");
            StringBuilder bookName = new StringBuilder();
            String tempBook = "";

            while (!tempBook.equals("1, ")){
                bookName.append(tempBook);
                tempBook = scan.next().toLowerCase() + ", ";

            }
            AddBooks (bookName, bookGenre, arrBooks);
            PrintCatalog (arrBooks);

        }
        }

    private static void AddBooks(StringBuilder bookName, String bookGenre, List<List<String>> arrBooks) {

        addGenre(bookGenre, arrBooks);

        for (List<String> tempBooksArr: arrBooks) {
            if (tempBooksArr.get(0).equals(bookGenre)){
                tempBooksArr.addAll(Arrays.asList(bookName.toString().split(", ")));
            }
        }
    }
    private static void addGenre(String bookGenre, List<List<String>> arrBooks) {
        for (List<String> tempArrBooks : arrBooks){
            if (tempArrBooks.get(0).equals(bookGenre)) {
                return;
            }
        }
        arrBooks.add(new ArrayList<String>(Collections.singletonList(bookGenre)));
    }
    private static void PrintCatalog(List<List<String>> arrBooks){
        for (List<String> list : arrBooks){
            System.out.print(list.get(0) + " - ");
            System.out.println(list.subList(1, list.size()).toString().replaceAll("[\\[\\]]", ""));
        }
    }


    // задание 2.2 из семинара. Элементы и количество их повторений. Вывести массив элементов без повторений.
    private static void task3_3() {
        List<String> planets = new ArrayList<>();
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Плутон");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Нептун");
        planets.add("Земля");
        planets.add("Марс");

        Set<String> singlePlanets = new HashSet<>(planets);
        for (String planet : singlePlanets){
            int count = Collections.frequency(planets, planet);
            System.out.println(planet + " : " + count);
        }
        System.out.println(singlePlanets);
    }
}






