package exm3.model;

public abstract class Jewellery implements Comparable<Jewellery>, Cloneable {
    private int article;
    private Producer producer;
    private double weight;
    private Material material;

    public Jewellery() {
    }

    public Jewellery(int article, Producer producer, double weight, Material material) {
        this.article = article;
        this.producer = producer;
        this.weight = weight;
        this.material = material;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public abstract double getDifficultFactor();

    public double calculatePrice() {
        double result = weight * material.getPriceGram() * getDifficultFactor();
        return result;
    }

    @Override
    public int compareTo(Jewellery jewellery) {
        if (article - jewellery.article != 0)
            return article - jewellery.article;
        if (producer.compareTo(jewellery.producer) != 0) // в продюсере уже переопределили метод
            return producer.compareTo(jewellery.producer);
        return Double.compare(weight, jewellery.weight);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Jewellery jewelleryClone = (Jewellery) super.clone(); // создаем ссылку - при помощи поверхностного копирования
        Producer producerClone = (Producer) this.producer.clone(); // и отдельно clone производителя, т.к. это ссылка
        jewelleryClone.producer = producerClone;
        return jewelleryClone;
    }

    public static void showJewellery(Jewellery[] jewelleries) {
        for (Jewellery jewellery : jewelleries) {
            System.out.println(jewellery);
        }

    }
}

