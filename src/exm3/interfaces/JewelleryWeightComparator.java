package exm3.interfaces;

import exm3.model.Jewellery;

import java.util.Comparator;

public class JewelleryWeightComparator implements Comparator<Jewellery> {
    @Override
    public int compare(Jewellery jewellery1, Jewellery jewellery2) {
        return Double.compare(jewellery1.getWeight(), jewellery2.getWeight());
    }
}