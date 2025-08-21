package com.example.ds_list_backend.dto;

import com.example.ds_list_backend.core.Game;

public record GameDto(Long id,
                      String title,
                      Integer year,
                      String imgUrl,
                      String shortDescription,
                      String longDescription) {



    public GameDto(Game game) {
        this(game.getId(),game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription(), game.getLongDescription());
    }

}
