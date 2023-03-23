package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String name;
    private String color;
    private String age;

    public Gato() {
    }

    public Gato(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(name, gato.name) && Objects.equals(color, gato.color) && Objects.equals(age, gato.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
