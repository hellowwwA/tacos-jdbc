package com.yyelloow.tacosjdbc.data;

import com.yyelloow.tacosjdbc.Ingredient;

import java.util.Iterator;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
