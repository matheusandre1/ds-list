package com.example.ds_list_backend.repository;

import com.example.ds_list_backend.core.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>
{
}
