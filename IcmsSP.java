package PatterFactory;

import imepac.edu.br.Orcamento;

import java.math.BigDecimal;

public class IcmsSP implements CalculoPorRegiao {
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.12"));
    }
}
