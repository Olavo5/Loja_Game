package com.game.gamemania.repository;
import com.game.gamemania.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}