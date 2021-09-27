package br.com.uvass.labprogdina.controller;

import br.com.uvass.labprogdina.model.entity.Categoria;
import br.com.uvass.labprogdina.model.entity.Produto;
import br.com.uvass.labprogdina.model.repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaRepository categoriaRepository;


    public CategoriaController(JdbcTemplate jdbcTemplate) {
        categoriaRepository = new CategoriaRepository(jdbcTemplate);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Categoria> buscarPeloId(
            @PathVariable Integer id) throws Exception {
        return categoriaRepository.buscarPeloId(id);
    }

    @GetMapping("id/produto")
    public List<Produto> buscarCategoriaProdutos
            (@PathVariable int id,
             @RequestParam(required = false) String nome, Float valorMinimo, Float valorMaximo
            ){
        return categoriaRepository.buscarCategoriaProdutos(id, nome, valorMinimo, valorMaximo);
    }

}




