package com.pokemonsystem.api.service;

import com.pokemonsystem.api.dto.PokemonDto;

import java.util.List;

public interface PokemonService {
    List<PokemonDto> getPokemon(int pageNo, int pageSize);

    PokemonDto detailPokemon(int  id);

    PokemonDto createPokemon(PokemonDto pokemonDto);

    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);

    void deletePokemon(int id);
}
