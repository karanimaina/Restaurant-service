package com.kafkatutorial.restaurant.wrappers;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;

import java.util.List;

public record FoodItemRecord(
         List<String> ingredients,
         String description,
         String price,
         Byte image,
         String estimatedPreparationTime) {
}
