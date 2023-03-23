package br.com.dio.model;

import java.util.Objects;

public class Livro {
    private String name;
    private Integer pageNumber;

    public Livro(String name, Integer pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(name, livro.name) && Objects.equals(pageNumber, livro.pageNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pageNumber);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
