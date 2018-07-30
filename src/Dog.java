import java.util.Objects;

public class Dog {
    private String name;
    private int chip;

    public Dog(String name, int chip) {
        this.name = name;
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public int getChip() {
        return chip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return chip == dog.chip &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, chip);
    }

    @Override
    public String toString() {
        return name + " " + chip;

    }
}