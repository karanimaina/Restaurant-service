package com.kafkatutorial.restaurant.service;

import com.kafkatutorial.restaurant.model.FoodItem;
import com.kafkatutorial.restaurant.wrappers.FoodItemRecord;
import com.kafkatutorial.restaurant.wrappers.RestaurantDto;
import com.kafkatutorial.restaurant.wrappers.UniversalResponse;
import reactor.core.publisher.Mono;

public interface RestaurantService {
    Mono<UniversalResponse>createRestaurant(RestaurantDto dto);
    Mono<UniversalResponse>createFoodItem(FoodItemRecord foodItem);
    Mono<UniversalResponse>addFoodItemToMenuCatalogue(FoodItemRecord foodItem);


}
