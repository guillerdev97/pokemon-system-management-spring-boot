package com.pokemonsystem.api.repository;

import com.pokemonsystem.api.models.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {
}
