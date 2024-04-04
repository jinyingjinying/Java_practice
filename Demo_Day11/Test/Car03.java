package Test;

import java.util.Objects;

public class Car03 {
    private String name;
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car03 car03 = (Car03) o;
        return Objects.equals(name, car03.name) && Objects.equals(color, car03.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Car03{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car03(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car03() {
    }
}
