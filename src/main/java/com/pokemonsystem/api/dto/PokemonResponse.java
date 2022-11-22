package com.pokemonsystem.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class PokemonResponse {
    private List<PokemonDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private long totalPages;
    private boolean last;
}
