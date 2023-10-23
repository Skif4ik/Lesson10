package exm3.model;

public class Producer implements Comparable<Producer>, Cloneable {
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    public Producer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producer{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Интерфейс Comparable – задать естественную сортировку на основании сравнения
    //   всех полей последовательно.
    @Override
    public int compareTo(Producer producer) {
        return name.compareToIgnoreCase(producer.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
