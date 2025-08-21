package com.example.ds_list_backend.dto;

import com.example.ds_list_backend.core.GameList;

public record GameListDto(Long id,
                          String name) {

    public GameListDto(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
