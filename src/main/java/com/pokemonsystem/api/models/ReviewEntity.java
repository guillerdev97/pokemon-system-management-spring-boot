package com.pokemonsystem.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// annotations for spring data jpa, it does the sql for us -> @Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReviewEntity {
    // identity -> not increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private int stars;
}
