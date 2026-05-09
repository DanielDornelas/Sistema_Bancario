package br.com.javabank.sistema;

import br.com.javabank.modelo.*;
import br.com.javabank.interfaces.*;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void abrirConta(Conta c) {
        contas.add(c);
        System.out.println("✓ Conta aberta: " + c.getNumero());
    }

    public void aplicarRendimentos() {
        for (Conta c : contas) {
            if (c instanceof Rendavel r) {
                r.aplicarRendimento();
            }
        }
    }

    public void gerarRelatorio() {
        for (Conta c : contas) {
            if (c instanceof Exportavel e) {
                e.gerarExtrato();
            }
        }
    }
}