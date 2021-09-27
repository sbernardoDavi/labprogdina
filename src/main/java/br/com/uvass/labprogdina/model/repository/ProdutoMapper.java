package br.com.uvass.labprogdina.model.repository;

import br.com.uvass.labprogdina.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException{
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setFotoUrl(resultSet.getString("fotoUrl"));
        produto.setDataCadastro(resultSet.getDate("dataCadastro").toLocalDate());
        produto.setDataHoraUltimaAtualizacao(resultSet.getDate("dataHoraUltimaAtualizacao").toLocalDate());
        produto.setValorUnitario(resultSet.getFloat("valorUnitario"));

        return produto;
    }
}
