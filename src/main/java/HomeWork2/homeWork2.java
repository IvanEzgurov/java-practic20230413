package HomeWork2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class homeWork2 {
    public static void main(String[] args) {
       exe1();
       exe2();


    }

    //1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
  //  Если значение null, то параметр не должен попадать в запрос.
  //          Пример 1:
  // Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
  // Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';

    private static void exe1() {
        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        System.out.println(getQuery(params1));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for(Map.Entry<String,String> pair : params.entrySet())
        {
            if(pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5, s.toString().length());
        return s.toString();
    }
//2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//    1 Расширение файла: txt
    private static void exe2() {
        String catalog = "C:\\Users\\Admin\\IdeaProjects\\java-practic20230413\\src";
        catalog = ".";
        File dir = new File(catalog);
        File[] test = dir.listFiles();
        for (File temp: test){
            if (!temp.isDirectory()){
                String[] nameFile = temp.getName().split("\\.");
                System.out.println("Расширение файла: " + nameFile[1]);
            }
        }
    }

}
