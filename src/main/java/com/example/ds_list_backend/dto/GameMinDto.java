package com.example.ds_list_backend.dto;

import com.example.ds_list_backend.core.Game;
import com.example.ds_list_backend.core.GameMinProjection;


public record GameMinDto(Long id,
                         String title,
                         Integer year,
                         String imgUrl,
                         String shortDescription

                         ) {

    public GameMinDto(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
    public GameMinDto(GameMinProjection game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }


}
