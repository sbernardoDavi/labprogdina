package br.com.uvass.labprogdina.model.repository;

import br.com.uvass.labprogdina.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository  {
    private final JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;

    }
        public List<Produto> listarTodos(Integer id){
            return jdbcTemplate.query("SELECT * FROM produto", new ProdutoMapper());

        }

        public Produto adicionarProduto(Produto produto) throws Exception {
        String sql = "INSERT into produto(id, nome, descricao, fotoUrl, dataCadastro, dataHoraUltimaAtualizacao, valorUnitario) values (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getFotoUrl(),
                produto.getDataCadastro(),
                produto.getDataHoraUltimaAtualizacao(),
                produto.getValorUnitario()

        );

            if (insert == 1){
                return produto;
            } throw new Exception("O produto não foi cadastrado");



    }

    public List<Produto> buscarNomeFaixaValor(String nome, Float valorMinimo, Float valorMaximo) {
        if (nome != null && valorMinimo == null && valorMaximo == null) {
            return jdbcTemplate.query(
                    "SELECT * FROM PRODUTO WHERE nome = ?",
                    new ProdutoMapper(),
                    nome
            );
        }
        if (nome == null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query(
                    "SELECT * FROM PRODUTO WHERE valorUnitario >= ? AND valorUnitario <= ?",
                    new ProdutoMapper(),
                    valorMinimo,
                    valorMaximo
            );
        }
        return jdbcTemplate.query(
                "SELECT * FROM PRODUTO WHERE nome = ? AND valorUnitario >= ? AND valorUnitario <= ?",
                new ProdutoMapper(),
                nome,
                valorMinimo,
                valorMaximo
        );
    }

    public ArrayList<Produto> buscarProdutoId(Integer id) throws Exception {
        String sql = "SELECT * FROM produto WHERE id = ?";
        ArrayList<Produto> buscar = (ArrayList<Produto>) jdbcTemplate.query(sql, new ProdutoMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{id}, new ProdutoMapper());
        }
        throw new Exception("Este produto não existe.");
    }


}

