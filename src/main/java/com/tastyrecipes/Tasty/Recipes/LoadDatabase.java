package com.tastyrecipes.Tasty.Recipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RecipeListRepository repository) {

        return args -> {

            Recipe turlu = new Recipe("Sebze Turlu");
            Recipe sarma = new Recipe("Yaprak Sarma");

            RecipeList recipeList = new RecipeList("Best food");

            recipeList.addRecipe(turlu);
            recipeList.addRecipe(sarma);

            log.info("Preloading " + repository.save(recipeList));
        };
    }
}