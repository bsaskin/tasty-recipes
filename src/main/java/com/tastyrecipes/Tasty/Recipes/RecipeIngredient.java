package com.tastyrecipes.Tasty.Recipes;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RecipeIngredient {
    private @Id @GeneratedValue Long id;
    private Recipe recipe;
    private float amount;

    public RecipeIngredient() {
    }

    public RecipeIngredient(Recipe recipe, float amount) {
        this.recipe = recipe;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof RecipeIngredient))
            return false;
        RecipeIngredient recipeIngredient = (RecipeIngredient) o;
        return Objects.equals(this.id, recipeIngredient.id)
                && Objects.equals(this.recipe, recipeIngredient.recipe)
                && Objects.equals(this.amount, recipeIngredient.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.recipe,
                this.amount
        );
    }

    @Override
    public String toString() {
        return "RecipeIngredient{"
                + "id=" + this.id +
                ", recipe='" + this.recipe.toString() + '\'' +
                ", amount='" + this.amount + '\'' +
                '}';
    }
}
