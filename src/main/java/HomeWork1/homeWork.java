package HomeWork1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        task1(5,3);
        task2();
        task3(5);
        task4();
    }

    //1. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
    //int длиной len, каждая ячейка которого равна initialValue;
    private static void task1(int len, int initialValue) {
        int[] arr = new int[len];
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    //2. Задать одномерный массив и найти
//в нем минимальный и максимальный элементы ;
    private static void task2() {
        int[] nums = {21,28,1,35,68,95,33};
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);
    }
    //3.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
   // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
    // принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void task3(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length-1; j < array[i].length; j++, x--) {
                if(i==j || i==x) array[i][j] = 1;
                else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    //4. В консоли запросить имя пользователя. В зависимости от текущего времени,
    // вывести приветствие вида:
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static void task4() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите ваше имя ");
        String name = myScan.nextLine();

        GregorianCalendar calendar = new GregorianCalendar();
        int time = calendar.get(Calendar.HOUR_OF_DAY);

        if (time >= 5 && time < 12) {
            System.out.printf("Доброе утро, %s\n", name);
        } else if (time >= 12 && time < 18) {
            System.out.printf("Добрый день, %s\n", name);
        } else if (time >= 18 && time < 23){
            System.out.printf("Добрый вечер, %s\n", name);
        } else {
            System.out.printf("Доброй ночи, %s\n", name);
        }

    }
}
