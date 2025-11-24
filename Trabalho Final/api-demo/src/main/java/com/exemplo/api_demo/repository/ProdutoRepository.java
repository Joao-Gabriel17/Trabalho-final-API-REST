package com.exemplo.api_demo.repository;

import com.exemplo.api_demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}