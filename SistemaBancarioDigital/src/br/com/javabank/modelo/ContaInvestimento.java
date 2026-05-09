package br.com.javabank.modelo;

import br.com.javabank.interfaces.*;

public class ContaInvestimento extends Conta
        implements Movimentavel, Rendavel, Tributavel, Exportavel {

    private double taxaRendimento = 0.01;
    private double aliquotaIR = 0.15;
    private double rendimentoAcumulado = 0;
    private String tipoInvestimento = "CDB";

    public ContaInvestimento(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    public void depositar(double valor) {
        saldo += valor;
        registrarHistorico("Depósito de R$ " + valor);
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("❌ Saldo insuficiente");
            return false;
        }
        saldo -= valor;
        registrarHistorico("Resgate de R$ " + valor);
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        double imposto = rendimento * aliquotaIR;

        saldo += (rendimento - imposto);
        rendimentoAcumulado += rendimento;

        registrarHistorico("Rendimento: R$ " + rendimento + " | IR: R$ " + imposto);
    }

    public double calcularImposto(double valor) {
        return valor * aliquotaIR;
    }

    public void aplicarTarifaMensal() {}

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public double getRendimentoAcumulado() {
        return rendimentoAcumulado;
    }

    public void gerarExtrato() {
        System.out.println("=== EXTRATO INVESTIMENTO ===");
        historico.forEach(System.out::println);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void exibirResumo() {
        System.out.println(titular + " | " + tipoInvestimento + " | Saldo: R$ " + saldo);
    }

    public String getTipo() {
        return "Investimento";
    }
}