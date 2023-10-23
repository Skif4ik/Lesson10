package exm2.model;

public enum Discount {
    UNDISCOUNTED(1.0),
    DISCOUNTED(0.9),
    REDDISCOUNTED(0.75);

    //дополнительное поле для каждого элемента перечесления
    private  double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    // можно сгенерировать сеттер для изменения поля
    // также в перечислении можно создавать дополнительные методы
    // как нестотические так и статические

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Discount{");
        sb.append("discount=").append(discount);
        sb.append(", name='").append(name()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
