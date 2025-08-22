package com.example.ds_list_backend.controller;

import com.example.ds_list_backend.dto.GameListDto;
import com.example.ds_list_backend.dto.GameMinDto;
import com.example.ds_list_backend.service.GameListService;
import com.example.ds_list_backend.service.GameService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    @Operation(summary = "Traz uma Lista de GamesList ")
    public ResponseEntity<List<GameListDto>> findLists() {
        var result = gameListService.findLists();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}/games")
    @Operation(summary = "Traz uma Lista de GameList Por identificação da tabela")
    public ResponseEntity<List<GameMinDto>> findByList(@PathVariable Long id) {
        var result = gameService.findByList(id);
        return ResponseEntity.ok(result);
    }
}
