package com.example.ds_list_backend.service;

import com.example.ds_list_backend.core.Game;
import com.example.ds_list_backend.core.GameList;
import com.example.ds_list_backend.dto.GameListDto;
import com.example.ds_list_backend.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDto> findLists() {
        var result = gameListRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }

}
