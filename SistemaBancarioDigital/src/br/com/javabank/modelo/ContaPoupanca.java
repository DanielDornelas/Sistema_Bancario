package br.com.javabank.modelo;

import br.com.javabank.interfaces.*;

public class ContaPoupanca extends Conta
        implements Movimentavel, Rendavel, Exportavel {

    private double taxaRendimento = 0.005;
    private double rendimentoAcumulado = 0;

    public ContaPoupanca(String numero, String agencia, String titular, double saldoInicial) {
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
        registrarHistorico("Saque de R$ " + valor);
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        rendimentoAcumulado += rendimento;
        registrarHistorico("Rendimento de R$ " + rendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public double getRendimentoAcumulado() {
        return rendimentoAcumulado;
    }

    public void gerarExtrato() {
        System.out.println("=== EXTRATO POUPANÇA ===");
        historico.forEach(System.out::println);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Rendimento acumulado: R$ " + rendimentoAcumulado);
    }

    public void exibirResumo() {
        System.out.println(titular + " | Poupança | Saldo: R$ " + saldo);
    }

    public String getTipo() {
        return "Poupança";
    }
}