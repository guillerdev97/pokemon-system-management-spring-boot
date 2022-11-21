package com.pokemonsystem.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// lombok generates for us
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PokemonEntity {
    /* models are nouns or
    pojos -> plain old java objects -> properties, getters and setters */

    // models represent database tables

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private variables and getters and setters = encapsulation
    private int id;
    private String name;
    private String type;

    // getter
   /* public int getId() {
        return id;
    }*/

    // setter
   /* public void setId(int id) {
        this.id = id;
    }*/

    // constructor
  /*  public PokemonEntity(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }*/
}
