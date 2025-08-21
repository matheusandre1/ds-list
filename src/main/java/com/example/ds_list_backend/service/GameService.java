package com.example.ds_list_backend.service;

import com.example.ds_list_backend.dto.GameDto;
import com.example.ds_list_backend.dto.GameMinDto;
import com.example.ds_list_backend.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameMinDto> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }

    @Transactional
    public GameDto findById(Long id) {
        var result = gameRepository.findById(id);
        return result.map(GameDto::new).orElse(null);
    }

}
