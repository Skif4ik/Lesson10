package exm1;

//1. Создать класс Человек с полями имя и любимая пора года. Пора года оформить в виде
//перечисления.


import exm1.model.Person;
import exm1.model.Season;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Для обращения к полям перечесления обращаемся через имя класса
        //Season.FALL
        //Season.FALL = null - нельзя изменять

        //Season season = new Season(); - невозможно создавать новые объекты перечесления

        Season season1 = Season.WINTER;
        Season season2 = Season.WINTER;
        //Ссылки на один и тот же объект
        System.out.println(season1 == season2);
        // Объекты по двум ссылкам идентичны
        System.out.println(season1.equals(season2));
        Season season3 = Season.SUMMER;
        // разные ссылки
        System.out.println(season1 == season3);
        //ссылки на неравные объекты
        System.out.println(season1.equals(season3));

        System.out.println(season3);//toString()
        System.out.println(season3.name());
        System.out.println(season3.ordinal());//возвращает номер индекса в перечислении(2)

        String str1 = "FaLl";
        str1 = str1.toUpperCase(); // приводим строку к верхнему регистру
        // из строки получить элемент перечесления
        // Season season4 = Season.valueOf(str1);
        Season season4 = switch (str1){
            case "WINTER", "SPRING", "SUMMER", "FALL" -> Season.valueOf(str1);
            default -> null;
        };
        System.out.println(season4);

        System.out.println("======================================================");

        switch (season2){
            case WINTER:
                System.out.println("холодно");
                break;
            case SPRING:
                System.out.println("тепло");
                break;
            case SUMMER:
                System.out.println("жарко");
                break;
            case FALL:
                System.out.println("сыро");
                break;
        }
        System.out.println("======================================================");

       // Season.values() - возвращается массив всех элементов перечесления
        for (Season value : Season.values()) {
            System.out.println(value);
        }

        //обращение к конкретному элементу перечесления через массив по индексу
        System.out.println(Season.values()[0]);

        System.out.println("======================================================");

        Person person1 = new Person("Igor",Season.FALL);
        System.out.println(person1);

        Scanner scanner = new Scanner(System.in);
        String strName = null;
        String strSeason = null;
        System.out.println("Введите имя");
        strName = scanner.nextLine();
        System.out.println("Введите пору года");
        strSeason = scanner.nextLine();

        strSeason =strSeason.toUpperCase();
        Season season5 = switch (strSeason){
            case "WINTER", "SPRING", "SUMMER", "FALL" -> Season.valueOf(strSeason);
            default -> null;
        };

        Person person2 = new Person(strName, season5);
        System.out.println(person2);

    }
}
