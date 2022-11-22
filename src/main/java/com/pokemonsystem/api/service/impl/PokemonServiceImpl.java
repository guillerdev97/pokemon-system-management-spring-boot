package com.pokemonsystem.api.service.impl;

import com.pokemonsystem.api.dto.PokemonDto;
import com.pokemonsystem.api.exceptions.PokemonNotFoundException;
import com.pokemonsystem.api.models.PokemonEntity;
import com.pokemonsystem.api.repository.PokemonRepository;
import com.pokemonsystem.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {
    private PokemonRepository pokemonRepository;

    @Autowired
    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public List<PokemonDto> getPokemon() {
        /*
          PokemonEntity pokemon1 = pokemonRepository.findById(10)
                .orElseThrow(() -> new PokemonNotFoundException("Pokemon not found"));
         */

        List<PokemonEntity> pokemons = pokemonRepository.findAll();

        return pokemons.stream().map(pokemon -> mapToDto(pokemon)).collect(Collectors.toList());
    }

    @Override
    public PokemonDto detailPokemon(int id) {
        PokemonEntity pokemon = pokemonRepository.findById(id)
                .orElseThrow(() -> new PokemonNotFoundException("Pokemon could not be found"));

        return mapToDto(pokemon);
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

    @Override
    public PokemonDto updatePokemon(PokemonDto pokemonDto, int id) {
        PokemonEntity pokemon = pokemonRepository.findById(id)
                .orElseThrow(() -> new PokemonNotFoundException("Pokemon could not be found"));

        pokemon.setName(pokemonDto.getName());
        pokemon.setType(pokemonDto.getType());

        PokemonEntity updatePokemon = pokemonRepository.save(pokemon);

        return mapToDto(updatePokemon);
    }

    private PokemonDto mapToDto(PokemonEntity pokemon) {
        PokemonDto pokemonDto = new PokemonDto();

        pokemonDto.setId(pokemon.getId());
        pokemonDto.setName(pokemon.getName());
        pokemonDto.setType(pokemon.getType());

        return pokemonDto;
    }

    private PokemonEntity mapToEntity(PokemonDto pokemonDto) {
        PokemonEntity pokemon = new PokemonEntity();

        pokemon.setId(pokemonDto.getId());
        pokemon.setName(pokemonDto.getName());
        pokemon.setType(pokemonDto.getType());

        return pokemon;
    }
}
