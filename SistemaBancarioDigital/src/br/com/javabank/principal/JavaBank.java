package br.com.javabank.principal;

import br.com.javabank.modelo.*;
import br.com.javabank.sistema.*;
import br.com.javabank.interfaces.Exportavel;

import java.util.ArrayList;

public class JavaBank {

    public static void main(String[] args) {

        Banco banco = new Banco("JavaBank");

        ContaCorrente cc = new ContaCorrente("1001-0", "0001", "Ana", 1000);
        ContaPoupanca cp = new ContaPoupanca("2001-0", "0001", "Carlos", 1500);
        ContaInvestimento ci = new ContaInvestimento("3001-0", "0001", "Ana", 5000);

        banco.abrirConta(cc);
        banco.abrirConta(cp);
        banco.abrirConta(ci);

        cc.depositar(500);
        cp.depositar(300);
        ci.depositar(2000);

        cc.sacar(200);
        cp.sacar(100);

        cc.transferir(300, cp);

        banco.aplicarRendimentos();

        ArrayList<Exportavel> lista = new ArrayList<>();
        lista.add(cc);
        lista.add(cp);
        lista.add(ci);

        for (Exportavel e : lista) {
            e.gerarExtrato();
        }
    }
}