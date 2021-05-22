package com.tastyrecipes.Tasty.Recipes;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient {
    private @Id
    @GeneratedValue
    Long id;
    private String title;
    private String unit;

    public Ingredient() {
    }

    public Ingredient(String title, String unit) {
        this.title = title;
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Ingredient))
            return false;
        Ingredient ingredient = (Ingredient) o;
        return Objects.equals(this.id, ingredient.id)
                && Objects.equals(this.title, ingredient.title)
                && Objects.equals(this.unit, ingredient.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.title,
                this.unit
        );
    }

    @Override
    public String toString() {
        return "Ingredient{"
                + "id=" + this.id +
                ", title='" + this.title + '\'' +
                ", unit='" + this.unit + '\'' +
                '}';
    }
}
