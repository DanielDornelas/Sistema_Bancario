package br.com.javabank.interfaces;

public interface Tributavel {
    double calcularImposto(double valor);
    void aplicarTarifaMensal();
}