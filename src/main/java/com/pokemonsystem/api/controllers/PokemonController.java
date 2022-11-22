package com.pokemonsystem.api.controllers;

import com.pokemonsystem.api.models.PokemonEntity;
import com.sun.istack.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// stub

/*
getPokemons
pokemonDetail
createPokemon
updatePokemon
deletePokemon
 */

@RestController
@RequestMapping("/api/")
public class PokemonController {
    // build endpoints
    @GetMapping("pokemon")
    public ResponseEntity<List<PokemonEntity>> getPokemons() {
        List<PokemonEntity> pokemons = new ArrayList<>();
        pokemons.add(new PokemonEntity(1, "Squirtle", "Water"));
        pokemons.add(new PokemonEntity(2, "Pikachu", "Electric"));
        pokemons.add(new PokemonEntity(3, "Charmander", "Fire"));

        return ResponseEntity.ok(pokemons);
    }

    @GetMapping("pokemon/{id}")
    public ResponseEntity<PokemonEntity> pokemonDetail(@PathVariable int id) {
        PokemonEntity pokemon = new PokemonEntity(id, "Squirtle", "Water");

        return ResponseEntity.ok().body(pokemon);
    }

    @PostMapping("/pokemon/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PokemonEntity> createPokemon(@RequestBody PokemonEntity pokemon) {
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());

        return new ResponseEntity<>(pokemon, HttpStatus.CREATED);
    }

    @PutMapping("/pokemon/{id}/update")
    public ResponseEntity<PokemonEntity> updatePokemon(@RequestBody PokemonEntity pokemon,
                                                       @PathVariable("id") int pokemonId) {
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());

        return ResponseEntity.ok(pokemon);
    }

    @DeleteMapping("/pokemon/{id}/delete")
    public ResponseEntity<String> deletePokemon(@PathVariable("id") int pokemonId) {
        System.out.println(pokemonId);

        return ResponseEntity.ok().body("Pokemon deleted successfully");
    }
}
