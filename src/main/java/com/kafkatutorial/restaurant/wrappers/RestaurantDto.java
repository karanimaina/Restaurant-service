package com.kafkatutorial.restaurant.wrappers;

import com.kafkatutorial.restaurant.model.MenuCatalogue;

public record RestaurantDto(
         Boolean restaurantName,
         String location,
         MenuCatalogue menuCatalogue
) {
}
