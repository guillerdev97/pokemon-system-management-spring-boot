package com.pokemonsystem.api.controllers;

import com.pokemonsystem.api.dto.PokemonDto;
import com.pokemonsystem.api.models.PokemonEntity;
import com.pokemonsystem.api.service.PokemonService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
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
    // inject service
    private PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    // build endpoints
    @GetMapping("pokemon")
    public ResponseEntity<List<PokemonDto>> getPokemons() {
        return ResponseEntity.ok().body(pokemonService.getPokemon());
    }

    @GetMapping("pokemon/{id}")
    public ResponseEntity<PokemonDto> pokemonDetail(@PathVariable int id) {
        return ResponseEntity.ok().body(pokemonService.detailPokemon(id));
    }

    // createPokemon
    @PostMapping("/pokemon/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto) {
        return new ResponseEntity<>(pokemonService.createPokemon(pokemonDto), HttpStatus.CREATED);
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
