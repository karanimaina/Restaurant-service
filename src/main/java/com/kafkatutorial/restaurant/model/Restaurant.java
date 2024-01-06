package com.kafkatutorial.restaurant.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Restaurant {
    private Boolean seatNumber;
    private String restaurantName;
    private MenuCatalogue menuCatalogue;

}
