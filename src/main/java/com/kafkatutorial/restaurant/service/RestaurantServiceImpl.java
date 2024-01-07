package com.kafkatutorial.restaurant.service;

import com.kafkatutorial.restaurant.wrappers.FoodItemRecord;
import com.kafkatutorial.restaurant.wrappers.RestaurantDto;
import com.kafkatutorial.restaurant.wrappers.UniversalResponse;
import reactor.core.publisher.Mono;

public class RestaurantServiceImpl implements RestaurantService{
    @Override
    public Mono<UniversalResponse> createRestaurant(RestaurantDto restaurantDto) {
        return nul;
    }

    @Override
    public Mono<UniversalResponse> createFoodItem(FoodItemRecord foodItem) {
        return null;
    }

    @Override
    public Mono<UniversalResponse> addFoodItemToMenuCatalogue(FoodItemRecord foodItem) {
        return null;
    }
}
