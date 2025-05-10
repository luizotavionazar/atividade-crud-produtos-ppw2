package br.edu.iftm.crud_produtos.repository;

import br.edu.iftm.crud_produtos.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
