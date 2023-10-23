package exm2.model;

//2.1. Создать перечисление с конструктором и геттером, содержащее значения скидок:
//UNDISCOUTED = 1, DISCOUNTED = 0.9, REDDISCOUTED = 0.75. Вывести на экран значения
//всех скидок.
//2.2. Создать перечисление с абстрактным методом, возвращающим величину скидки:
//UNDISCOUTED = 1, DISCOUNTED = 0.9, REDDISCOUTED = 0.75. Вывести на экран значения
//всех скидок.

public class Main2 {
    public static void main(String[] args) {
        for (Discount value : Discount.values()) {
            System.out.println(value);
        }
       double x = Discount.DISCOUNTED.getDiscount();
        System.out.println(x);

        System.out.println("-------------------------------------------------");
        for (AbstractDiscount value : AbstractDiscount.values()) {
            System.out.println(value.discount());
        }
        //количество элементов перечесления
        System.out.println("количество элементов перечесления :");
        System.out.println(AbstractDiscount.values().length);
    }
}
