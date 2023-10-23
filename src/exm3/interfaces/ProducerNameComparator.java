package exm3.interfaces;



import exm3.model.Producer;

import java.util.Comparator;

public class ProducerNameComparator implements Comparator<Producer> {

    @Override
    public int compare(Producer producer1, Producer producer2) {
        return producer1.getName().compareToIgnoreCase(producer2.getName());
    }
}