package com.kafkatutorial.restaurant.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Restaurant extends BaseEntity {
    private Boolean restaurantName;
    private String location;
    private MenuCatalogue menuCatalogue;

}
