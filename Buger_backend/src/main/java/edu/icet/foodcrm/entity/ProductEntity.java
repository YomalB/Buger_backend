package edu.icet.foodcrm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer Id;
    private String name;
    private String description;
    private String category;
}
