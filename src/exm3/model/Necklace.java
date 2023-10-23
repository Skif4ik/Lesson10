package exm3.model;

public class Necklace extends Jewellery{
    private static double necklaceDifficultFactor = 1.4;

    public Necklace() {
    }

    public Necklace(int article, Producer producer, double weight, Material material) {
        super(article, producer, weight, material);
    }
    //конструктор копия
    public Necklace(Necklace necklace) {
        super(necklace.getArticle(), necklace.getProducer(), necklace.getWeight(), necklace.getMaterial());
    }

    @Override
    public double getDifficultFactor() {
        return necklaceDifficultFactor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("exm3.model.Necklace{");
        sb.append("article=").append(getArticle());
        sb.append(", producer=").append(getProducer());
        sb.append(", weight=").append(getWeight());
        sb.append(", material=").append(getMaterial());
        sb.append(", calculatePrice=").append(calculatePrice());
        sb.append('}');
        return sb.toString();
    }
}
