package exm3.model;

public class Ring extends Jewellery{
    private static double ringDifficultFactor = 1.2;
    private double size;

    public Ring() {
    }

    public Ring(int article, Producer producer, double weight, Material material, double size) {
        super(article, producer, weight, material);
        this.size = size;
    }

    //конструктор копия
    public Ring(Ring ring) {
        super(ring.getArticle(), ring.getProducer(), ring.getWeight(), ring.getMaterial());
        this.size = ring.size;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getDifficultFactor() {
        return ringDifficultFactor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("exm3.model.Ring{");
        sb.append("article=").append(getArticle());
        sb.append(", producer=").append(getProducer());
        sb.append(", weight=").append(getWeight());
        sb.append(", material=").append(getMaterial());
        sb.append(", calculatePrice=").append(calculatePrice());
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
