package com.example.ds_list_backend.service;

import com.example.ds_list_backend.core.Game;
import com.example.ds_list_backend.core.GameList;
import com.example.ds_list_backend.dto.GameListDto;
import com.example.ds_list_backend.dto.MovementDto;
import com.example.ds_list_backend.repository.GameListRepository;
import com.example.ds_list_backend.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameListDto> findLists() {
        var result = gameListRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }

    @Transactional
    public void move(Long listId, MovementDto movementDto) {
        var games = gameRepository.searchByList(listId);

        var obj = games.remove(movementDto.sourceIndex());

        games.add(movementDto.destinationIndex(), obj);

        int min = Math.min(movementDto.sourceIndex(), movementDto.destinationIndex());
        int max = Math.max(movementDto.sourceIndex(), movementDto.destinationIndex());
        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, games.get(i).getId(), i);
        }
    }

}
