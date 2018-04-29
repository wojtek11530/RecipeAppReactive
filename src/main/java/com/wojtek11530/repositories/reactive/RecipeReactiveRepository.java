package com.wojtek11530.repositories.reactive;

import com.wojtek11530.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
