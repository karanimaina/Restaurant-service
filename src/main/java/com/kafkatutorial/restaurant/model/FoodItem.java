package com.kafkatutorial.restaurant.model;

import jakarta.persistence.Lob;

import java.util.List;

public class FoodItem {
    private List<String> ingredients;
    private String description;
    private String price;
    @Lob
    private Byte image;
    private String estimatedPreparationTime;
}
