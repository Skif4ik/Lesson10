package exm3.model;

public class Earrings extends Jewellery{
    private static double earringDifficultFactor = 1.5;

    public Earrings() {
    }

    public Earrings(int article, Producer producer, double weight, Material material) {
        super(article, producer, weight, material);
    }



    @Override
    public double getDifficultFactor() {
        return earringDifficultFactor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("exm3.model.Earrings{");
        sb.append("article=").append(getArticle());
        sb.append(", producer=").append(getProducer());
        sb.append(", weight=").append(getWeight());
        sb.append(", material=").append(getMaterial());
        sb.append(", calculatePrice=").append(calculatePrice());
        sb.append('}');
        return sb.toString();
    }
}
