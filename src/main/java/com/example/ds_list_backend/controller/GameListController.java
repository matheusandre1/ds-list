package com.example.ds_list_backend.controller;

import com.example.ds_list_backend.dto.GameListDto;
import com.example.ds_list_backend.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public ResponseEntity<List<GameListDto>> findLists() {
        var result = gameListService.findLists();
        return ResponseEntity.ok(result);
    }
}
