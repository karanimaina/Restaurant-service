package com.kafkatutorial.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@MappedSuperclass
@Getter
@Setter
public class FoodItem extends BaseEntity {
    @Lob
    private List<String> ingredients;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private String price;
    @Lob
    private Byte image;
    private String estimatedPreparationTime;
}
