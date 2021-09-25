package br.com.uvass.labprogdina.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class PromocaoItem {
    private Integer id;
    private Float valorPromocao;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private LocalDate dataUltimaAtualizacao;
    private Produto produto;
    private TabelaDePromocao tabelaDePromocao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(Float valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TabelaDePromocao getTabelaDePromocao() {
        return tabelaDePromocao;
    }

    public void setTabelaDePromocao(TabelaDePromocao tabelaPromocao) {
        this.tabelaDePromocao = tabelaPromocao;
    }
}