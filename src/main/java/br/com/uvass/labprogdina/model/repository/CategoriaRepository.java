package br.com.uvass.labprogdina.model.repository;

import br.com.uvass.labprogdina.model.entity.Categoria;
import br.com.uvass.labprogdina.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class CategoriaRepository {
    private final JdbcTemplate jdbcTemplate;

    public CategoriaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ArrayList<Categoria> buscarPeloId(Integer id) throws Exception{
        String sql = "SELECT * FROM categoria WHERE id = ?";
        ArrayList<Categoria> buscar = (ArrayList<Categoria>) jdbcTemplate.query(sql, new CategoriaMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Categoria>) jdbcTemplate.query(sql, new Object[]{id}, new CategoriaMapper());
        }
        throw new Exception("Categoria Inexistente");
    }

    public List<Produto> buscarCategoriaProdutos(Integer id, String nome, Float valorMinimo, Float valorMaximo) {
        if (nome == null && valorMinimo == null && valorMaximo == null) {
            return jdbcTemplate.query(
                    "select p.*, pc.categoriaId FROM produto p INNER JOIN produtoCategoria pc ON pc.produtoId = p.id WHERE pc.categoriaId = ?",
                    new ProdutoMapper(),
                    id
            );
        }
        if (nome != null && valorMinimo == null && valorMaximo == null) {
            return jdbcTemplate.query(
                    "select p.* FROM produto p INNER JOIN produtoCategoria pc ON pc.produtoId = p.id WHERE pc.categoriaId = ? AND p.nome = ?",
                    new ProdutoMapper(),
                    id,
                    nome
            );
        }
        if (nome == null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query(
                    "select p.* FROM produto p INNER JOIN produtoCategoria pc ON pc.produtoId = p.id WHERE pc.categoriaId = ? AND p.valorUnitario >= ? AND p.valorUnitario <= ?",
                    new ProdutoMapper(),
                    id,
                    valorMinimo,
                    valorMaximo
            );
        }
        return jdbcTemplate.query(
                "select p.*, pc.categoriaId FROM produto p INNER JOIN produtoCategoria pc ON pc.produtoId = p.id WHERE pc.categoriaId = ? AND p.nome = ? AND p.valorUnitario >= ? AND p.valorUnitario <= ?",
                new ProdutoMapper(),
                id,
                nome,
                valorMinimo,
                valorMaximo
        );
    }
}

