package br.com.uvass.labprogdina.controller;


import br.com.uvass.labprogdina.model.entity.Produto;
import br.com.uvass.labprogdina.model.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/produto")
public class ProdutoController{
    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Produto inserirProduto(@RequestBody Produto produto) throws Exception{
        return produtoRepository.adicionarProduto(produto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/id")
    public ArrayList<Produto> buscarPeloId(@PathVariable Integer id) throws Exception {
        return produtoRepository.buscarProdutoId(id);
    }


    @GetMapping()
    public List<Produto> buscarPorFiltro(
            @RequestParam(required = false) String nome, Float valorMinimo, Float valorMaximo
    ){
        return produtoRepository.buscarNomeFaixaValor(nome, valorMinimo, valorMaximo);
    }







}
