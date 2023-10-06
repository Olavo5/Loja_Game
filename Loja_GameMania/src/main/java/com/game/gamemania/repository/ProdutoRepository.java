package com.game.gamemania.repository;


import com.game.gamemania.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}