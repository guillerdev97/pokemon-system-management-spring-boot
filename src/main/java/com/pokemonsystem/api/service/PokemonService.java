package com.pokemonsystem.api.service;

import com.pokemonsystem.api.dto.PokemonDto;

import java.util.List;

public interface PokemonService {
    List<PokemonDto> getPokemon();

    PokemonDto detailPokemon(int  id);

    PokemonDto createPokemon(PokemonDto pokemonDto);

    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);
}
