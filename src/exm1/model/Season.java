package exm1.model;

// enum - это необычного рода класс который наследует не у Object, а у класса Enum

// Перечесления позволяют объеденить набор логически связанных между собой именнованых констант
public enum Season {
    WINTER, // public static final Season WINTER = new Season("WINTER", 0);
    SPRING,
    SUMMER,
    FALL
}
