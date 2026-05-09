package br.com.javabank.modelo;

import br.com.javabank.interfaces.*;

public class ContaCorrente extends Conta
        implements Movimentavel, Transferivel, Tributavel, Exportavel {

    private double limiteCredito = 500;
    private double tarifaMensal = 12.90;

    public ContaCorrente(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    public void depositar(double valor) {
        saldo += valor;
        registrarHistorico("Depósito de R$ " + valor);
    }

    public boolean sacar(double valor) {
        if (valor > saldo + limiteCredito) {
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

    public boolean transferir(double valor, Conta destino) {
        if (sacar(valor)) {
            destino.saldo += valor;
            registrarHistorico("Transferência de R$ " + valor + " para " + destino.getNumero());
            return true;
        }
        return false;
    }

    public void exibirHistorico() {
        historico.forEach(System.out::println);
    }

    public double calcularImposto(double valor) {
        return valor * 0.0038;
    }

    public void aplicarTarifaMensal() {
        saldo -= tarifaMensal;
        registrarHistorico("Tarifa mensal de R$ " + tarifaMensal);
    }

    public void gerarExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        historico.forEach(System.out::println);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void exibirResumo() {
        System.out.println(titular + " | Conta: " + numero + " | Saldo: R$ " + saldo);
    }

    public String getTipo() {
        return "Corrente";
    }
}