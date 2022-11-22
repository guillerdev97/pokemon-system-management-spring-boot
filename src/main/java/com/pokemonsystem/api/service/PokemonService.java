package com.pokemonsystem.api.service;

import com.pokemonsystem.api.dto.PokemonDto;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
}
