package com.pokemonsystem.api.repository;

import com.pokemonsystem.api.models.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
we need to use this repository methods in the service layer to create other layer of abstraction
 */

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {
}
