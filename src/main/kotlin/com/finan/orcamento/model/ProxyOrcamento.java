package com.finan.orcamento.model;

import java.math.BigDecimal;

public class ProxyOrcamento extends OrcamentoModel {

    // Atributos
    private BigDecimal descontoOrcamento;
    private OrcamentoModel orcamentoModel;

    // Construtor
    public ProxyOrcamento(OrcamentoModel orcamentoModel) {
        this.orcamentoModel = orcamentoModel;
    }

    // Métodos
    @Override
    public BigDecimal getDescontoOrcamento() {
        if (descontoOrcamento == null) {
            descontoOrcamento = orcamentoModel.getDescontoOrcamento();
        }
        return descontoOrcamento;
    }

    @Override
    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

    public BigDecimal getValorOrcamento() {
        return orcamentoModel.getValorOrcamento();
}

}