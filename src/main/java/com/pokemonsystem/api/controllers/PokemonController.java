package com.pokemonsystem.api.controllers;

import com.pokemonsystem.api.models.PokemonEntity;
import org.apache.tomcat.jni.Proc;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {
    public ResponseEntity<List<PokemonEntity>> getPokemons() {
        List<PokemonEntity> pokemons = new ArrayList<>();
        pokemons.add(new PokemonEntity(1, "Squirtle", "Water"));
        pokemons.add(new PokemonEntity(2, "Pikachu", "Electric"));
        pokemons.add(new PokemonEntity(3, "Charmander", "Fire"));
        return ResponseEntity.ok(pokemons);
    }
}
