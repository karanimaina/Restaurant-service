package com.kafkatutorial.restaurant.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@MappedSuperclass
@Getter
@Setter
public class MenuCatalogue extends  BaseEntity {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<FoodItem> foodItems;
    private long userId;
}
