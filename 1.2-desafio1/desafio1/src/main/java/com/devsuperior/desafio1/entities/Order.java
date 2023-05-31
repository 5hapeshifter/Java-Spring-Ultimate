package com.devsuperior.desafio1.entities;

public class Order {

    private Integer codigo;
    private Double valorBasico;
    private Double porcentagemDesconto;

    public Order() {
    }

    public Order(Integer codigo, Double valorBasico, double porcentagemDesconto) {
        this.codigo = codigo;
        this.valorBasico = valorBasico;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(Double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public Double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setPorcentagemDesconto(Double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }
}
