package br.com.javabank.modelo;

import java.util.ArrayList;

public abstract class Conta {

    protected String numero;
    protected String agencia;
    protected String titular;
    protected double saldo;
    protected ArrayList<String> historico;

    public Conta(String numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();

        registrarHistorico("Conta aberta com saldo inicial de R$ " + saldoInicial);
    }

    protected void registrarHistorico(String msg) {
        historico.add(msg);
    }

    public String getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public abstract String getTipo();
}