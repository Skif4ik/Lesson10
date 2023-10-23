package exm3;

//4. Создать класс, описывающий ювелирное украшение (артикул, производитель, вес,
//материал).
//Производитель оформить как отдельный класс, содержащий наименование
//производителя.
//Материал оформить как перечисление, позволяющее хранить информацию о цене
//материала за грамм и русскоязычным описанием названия материала. Создать классы,
//конкретизирующие ювелирные украшения (Кольцо – дополнительная характеристика
//размер, Серьги и Подвеска). Для конкретизирующих классов задайте коэффициент
//сложности изготовление, учитывающийся при расчете стоимости украшения
//(вес*стоимость за грамм*коэффициент).
//
//Создать массив по два украшения каждого класса. Вывести информацию обо всех
//украшениях.
//Создать отдельно объект класса Кольцо; создать точную копию этого кольца используя
//конструктор копирования. Изменить в кольце копии производителя. Заменить первый
//элемент массива украшений точной копией последнего.

import exm3.interfaces.JewelleryWeightComparator;
import exm3.interfaces.ProducerNameComparator;
import exm3.model.*;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Producer[] producers ={
                new Producer("SLAVIA"),
                new Producer("CRISTAL"),
                new Producer("SOKOLOV")
        };

        Jewellery[] jewelleries ={
                new Ring(123, producers[0], 3, Material.GOLD, 17),
                new Earrings(234, producers[1], 5, Material.SILVER),
                new Necklace(741, producers[2], 2, Material.WHITE_GOLD),
                new Ring(125, producers[2], 5, Material.GOLD, 17),
                new Earrings(234, producers[1], 4, Material.SILVER),
                new Necklace(741, producers[0], 7, Material.WHITE_GOLD)
        };

        for (Jewellery jewellery : jewelleries) {
            System.out.println(jewellery);
        }
        System.out.println("=====================================");
//Создать отдельно объект класса Кольцо; создать точную копию этого кольца
        Ring ring = new Ring(222, producers[2], 2, Material.SILVER, 116);
        Ring ringCopy = new Ring(ring);
        System.out.println(ring);
        System.out.println(ringCopy);
//Изменить в кольце копии производителя
        ringCopy.setProducer(producers[0]);
        System.out.println("Новый поставщик: " + ringCopy);
//Заменить первый элемент массива украшений точной копией последнего.
        jewelleries[0] = new Necklace((Necklace) jewelleries[jewelleries.length - 1]);

        System.out.println("результат");
        Jewellery.showJewellery(jewelleries);
        System.out.println(jewelleries[0] == jewelleries[2]);

//классов реализующих интерфейс Comparator,
        System.out.println("Сортировка");
        Arrays.sort(jewelleries);
        System.out.println("После сортировки");
        Jewellery.showJewellery(jewelleries);

        ProducerNameComparator producersSort = new ProducerNameComparator();
        Arrays.sort(producers, producersSort);
        System.out.println("После сортировки поставщиков");
        Jewellery.showJewellery(jewelleries);

        JewelleryWeightComparator jewelleryWeightComparator = new JewelleryWeightComparator();
        Arrays.sort(jewelleries, jewelleryWeightComparator);
        System.out.println("После сортировки по весу");
        Jewellery.showJewellery(jewelleries);

        // копирование с помощью интерфейса
        Ring ring1 = new Ring(ring);
        Ring ring1Copy = (Ring) ring1.clone();
        System.out.println("Копирование при помощи интерфейса");
        System.out.println(ring1);
        System.out.println(ring1Copy);
        System.out.println(ring1 == ring1Copy);

    }
}
