package com.pokemonsystem.api.service;

import com.pokemonsystem.api.dto.PokemonDto;
import com.pokemonsystem.api.dto.PokemonResponse;

import java.util.List;

public interface PokemonService {
    PokemonResponse getPokemon(int pageNo, int pageSize);

    PokemonDto detailPokemon(int  id);

    PokemonDto createPokemon(PokemonDto pokemonDto);

    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);

    void deletePokemon(int id);
}
