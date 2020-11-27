package com.yyelloow.tacosjdbc.web;

import com.yyelloow.tacosjdbc.Ingredient;
import com.yyelloow.tacosjdbc.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public Ingredient convert(String s) {
        return ingredientRepository.findById(s);
    }
}
