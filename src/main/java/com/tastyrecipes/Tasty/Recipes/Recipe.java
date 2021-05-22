package com.tastyrecipes.Tasty.Recipes;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recipe {
    private @Id
    @GeneratedValue
    Long id;
    private String title;
    private RecipeIngredient[] ingredients;
    private String description;
    private String[] steps;

    public Recipe() {
    }

    public Recipe(String title) {
        this.title = title;
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

    public RecipeIngredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(RecipeIngredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Recipe))
            return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(this.id, recipe.id)
                && Objects.equals(this.title, recipe.title)
                && Objects.equals(this.ingredients, recipe.ingredients)
                && Objects.equals(this.description, recipe.description)
                && Objects.equals(this.steps, recipe.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.title,
                Arrays.hashCode(this.ingredients),
                this.description,
                Arrays.hashCode(this.steps)
        );
    }

    @Override
    public String toString() {
        return "Recipe{"
                + "id=" + this.id +
                ", title='" + this.title + '\'' +
                ", ingredients='" + this.ingredients.toString() + '\'' +
                ", desctiption='" + this.description + '\'' +
                ", steps='" + this.steps.toString() + '\'' +
                '}';
    }
}
