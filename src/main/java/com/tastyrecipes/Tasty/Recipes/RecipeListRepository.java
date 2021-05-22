package com.tastyrecipes.Tasty.Recipes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeListRepository extends JpaRepository<RecipeList, Long> {
}