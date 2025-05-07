package br.edu.iftm.crud_produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.crud_produtos.entity.Produto;
import br.edu.iftm.crud_produtos.repository.ProdutoRepository;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listarProdutos(){
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    @GetMapping("/produtos/{id}")
    public Produto buscarProdutoPorId(@PathVariable Integer id) {
        return produtoRepository.findById(id).orElse(null);
    }
}
