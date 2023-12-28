package com.seubarbosa.cardapio.controller;

import com.seubarbosa.cardapio.food.Food;
import com.seubarbosa.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;

    }
}
