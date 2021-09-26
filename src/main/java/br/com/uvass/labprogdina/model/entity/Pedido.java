package br.com.uvass.labprogdina.model.entity;

import java.time.LocalTime;
import java.util.List;

public class Pedido {
    private Integer id;
    private LocalTime dataCadastro;
    private Float valorTotal;
    private PedidoStatus pedidoStatus;
    private List<ItemPedido> itemPedidoList;

    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }

    public void setItemPedidoList(List<ItemPedido> itemPedidoList) {
        this.itemPedidoList = itemPedidoList;
    }

    public PedidoStatus getPedidoStatus() {
        return pedidoStatus;
    }

    public void setPedidoStatus(PedidoStatus pedidoStatus) {
        this.pedidoStatus = pedidoStatus;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}