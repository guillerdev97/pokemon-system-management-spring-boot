package com.pokemonsystem.api.models;

import lombok.Data;

@Data
public class ReviewEntity {
    private int id;
    private String title;
    private String content;
    private int stars;
}
