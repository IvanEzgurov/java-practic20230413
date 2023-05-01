package HomeWork4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        //task4_1();
        task4_2();


    }

    //Принимает от пользователя и “запоминает” строки.
        //1. Реализовать консольное приложение, которое:
        // Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        // Если введено revert, удаляет предыдущую введенную строку из памяти.

    private static void task4_1() {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Введите строку либо print для вывода сток либо revert для удаления предыдущей строки: ");
            String input = scan.nextLine();

            if (input.equals("print")) {
                System.out.println(("Строки в обратном порядке: "));
                while (!list.isEmpty()){
                    System.out.println(list.removeLast());
                }

            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println(("Последняя строка удалена."));
                } else {
                    System.out.println("Нет строк для удаления.");
                }
            } else {
                list.addLast(input);
            }
        }
    }
    //2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    private static void task4_2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }
    public static LinkedList reverseLinkedList(LinkedList list){
        Collections.reverse(list);
        return list;
    }
}
