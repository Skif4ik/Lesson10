package exm3.model;

public enum Material {
    GOLD(110, "золото"),
    SILVER(15, "серебро"),
    WHITE_GOLD(130, "белое золото");

    private double priceGram;
    private String rusTitle;

    Material(double priceGram, String rusTitle) {
        this.priceGram = priceGram;
        this.rusTitle = rusTitle;
    }

    public double getPriceGram() {
        return priceGram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Material{");
        sb.append("priceGram=").append(priceGram);
        sb.append(", rusTitle='").append(rusTitle).append('\'');
        sb.append(", name='").append(name()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
