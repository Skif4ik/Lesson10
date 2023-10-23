package exm1.model;

public class Person {
    private String name;
    private Season favouriteSeason;

    public Person() {
    }

    public Person(String name, Season favouriteSeason) {
        this.name = name;
        this.favouriteSeason = favouriteSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getFavouriteSeason() {
        return favouriteSeason;
    }

    public void setFavouriteSeason(Season favouriteSeason) {
        this.favouriteSeason = favouriteSeason;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", favouriteSeason=").append(favouriteSeason);
        sb.append('}');
        return sb.toString();
    }
}
