package com.pokemonsystem.api.service.impl;

import com.pokemonsystem.api.dto.PokemonDto;
import com.pokemonsystem.api.models.PokemonEntity;
import com.pokemonsystem.api.repository.PokemonRepository;
import com.pokemonsystem.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements PokemonService {
    private PokemonRepository pokemonRepository;

    @Autowired
    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public PokemonDto createPokemon(PokemonDto pokemonDto) {
        PokemonEntity pokemon = new PokemonEntity();
        pokemon.setName(pokemonDto.getName());
        pokemon.setType(pokemonDto.getType());

        PokemonEntity newPokemon = pokemonRepository.save(pokemon);

        PokemonDto pokemonResponse = new PokemonDto();
        pokemonResponse.setName(newPokemon.getName());
        pokemonResponse.setType(newPokemon.getType());

        return pokemonResponse;
    }
}
