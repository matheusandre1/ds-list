package com.example.ds_list_backend.controller;

import com.example.ds_list_backend.dto.GameDto;
import com.example.ds_list_backend.dto.GameMinDto;
import com.example.ds_list_backend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public ResponseEntity<List<GameMinDto>> findAll() {
        var result = gameService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDto> findById(@PathVariable Long id)
    {
        var result = gameService.findById(id);
        return result != null ? ResponseEntity.ok(result) : ResponseEntity.notFound().build();
    }
}
