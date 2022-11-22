package com.pokemonsystem.api.exceptions;

public class PokemonNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public PokemonNotFoundException(String message) {
        // super passes this constructor to the extended class
        super(message);
    }
}
