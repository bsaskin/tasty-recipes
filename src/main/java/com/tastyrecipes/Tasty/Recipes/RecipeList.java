package com.tastyrecipes.Tasty.Recipes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RecipeList {
    private @Id
    @GeneratedValue
    Long id;
    String title;
    private List<Recipe> recipeList;

    public RecipeList() {
    }

    public RecipeList(String title) {
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

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void addRecipe(Recipe recipe){
        this.recipeList.add(recipe);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof RecipeList))
            return false;
        RecipeList recipeList = (RecipeList) o;
        return Objects.equals(this.id, recipeList.id)
                && Objects.equals(this.title, recipeList.title)
                && Objects.equals(this.recipeList, recipeList.recipeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.title,
                this.recipeList
        );
    }

    @Override
    public String toString() {
        return "RecipeList{"
                + "id=" + this.id +
                ", title='" + this.title + '\'' +
                ", recipes='" + this.recipeList.toString() + '\'' +
                '}';
    }
}
