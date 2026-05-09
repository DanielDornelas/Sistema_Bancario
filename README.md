# JavaBank 🏦

Sistema bancário digital desenvolvido em Java com foco em Programação Orientada a Objetos (POO), utilizando interfaces, polimorfismo, classes abstratas e organização em pacotes.

---

## 📋 Sobre o Projeto

O **JavaBank** simula o funcionamento básico de um banco digital, permitindo:

- abertura de contas
- depósitos
- saques
- transferências
- aplicação de rendimentos
- cálculo de impostos
- geração de extratos

O projeto foi desenvolvido com o objetivo de praticar conceitos importantes da linguagem Java, principalmente o uso de **interfaces** e **polimorfismo**.

---

# 🚀 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Interfaces
- Classes Abstratas
- ArrayList
- Encapsulamento
- Polimorfismo
- Organização em Pacotes

---

# 📂 Estrutura de Pacotes

```text
src/
└── br/
    └── com/
        └── javabank/
            ├── interfaces/
            │   ├── Movimentavel.java
            │   ├── Transferivel.java
            │   ├── Rendavel.java
            │   ├── Tributavel.java
            │   └── Exportavel.java
            │
            ├── modelo/
            │   ├── Conta.java
            │   ├── ContaCorrente.java
            │   ├── ContaPoupanca.java
            │   └── ContaInvestimento.java
            │
            ├── sistema/
            │   └── Banco.java
            │
            └── principal/
                └── JavaBank.java
```

---

# 🧩 Interfaces do Sistema

## 🔹 Movimentavel

Responsável pelas operações financeiras básicas:

- `depositar()`
- `sacar()`
- `getSaldo()`

---

## 🔹 Transferivel

Responsável pelas transferências entre contas:

- `transferir()`
- `exibirHistorico()`

---

## 🔹 Rendavel

Responsável pelo cálculo e aplicação de rendimentos:

- `aplicarRendimento()`
- `getTaxaRendimento()`
- `getRendimentoAcumulado()`

---

## 🔹 Tributavel

Responsável pelo cálculo de impostos e tarifas:

- `calcularImposto()`
- `aplicarTarifaMensal()`

---

## 🔹 Exportavel

Responsável pela geração de extratos e resumos:

- `gerarExtrato()`
- `exibirResumo()`

---

# 🏦 Tipos de Conta

## 💳 Conta Corrente

Implementa:

- `Movimentavel`
- `Transferivel`
- `Tributavel`
- `Exportavel`

### Funcionalidades

✔ Limite de crédito  
✔ Transferências  
✔ Tarifa mensal  
✔ Histórico completo  
✔ Extrato detalhado  

---

## 💰 Conta Poupança

Implementa:

- `Movimentavel`
- `Rendavel`
- `Exportavel`

### Funcionalidades

✔ Aplicação de rendimento  
✔ Controle de saldo  
✔ Histórico de movimentações  
✔ Extrato detalhado  

---

## 📈 Conta Investimento

Implementa:

- `Movimentavel`
- `Rendavel`
- `Tributavel`
- `Exportavel`

### Funcionalidades

✔ Rendimentos automáticos  
✔ Cálculo de IR  
✔ Controle de investimentos  
✔ Extrato com impostos estimados  

---

# 🏛️ Classe Banco

A classe `Banco` é responsável por:

- abrir contas
- buscar contas
- listar contas
- aplicar rendimentos
- gerar relatórios gerais

Utilizando polimorfismo para trabalhar com diferentes tipos de contas.

---

# 🔥 Conceitos Aplicados

## ✅ Interfaces

Utilização de contratos para definir comportamentos compartilhados entre classes.

---

## ✅ Polimorfismo

Uso de listas com interfaces:

```java
ArrayList<Exportavel>
ArrayList<Rendavel>
```

---

## ✅ Classes Abstratas

A classe `Conta` serve como base para todas as contas do sistema.

---

## ✅ Encapsulamento

Atributos protegidos e acesso controlado por métodos getters.

---

## ✅ Histórico de Movimentações

Cada conta possui um histórico armazenado em:

```java
ArrayList<String> historico
```

---

# ▶️ Exemplo de Execução

```text
=== ABERTURA DE CONTAS ===
✓ Conta Corrente aberta: 1001-0
✓ Conta Poupança aberta: 2001-0
✓ Conta Investimento aberta: 3001-0

=== MOVIMENTAÇÕES ===
💰 Depósito realizado
💸 Saque realizado
🔁 Transferência concluída

=== RENDIMENTOS ===
📈 Rendimento aplicado

=== TRIBUTAÇÃO ===
💳 Tarifa mensal aplicada

=== EXTRATOS ===
Extratos gerados com sucesso
```

---

# 🛠️ Como Executar o Projeto

## 1️⃣ Clone o repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

---

## 2️⃣ Abra o projeto na IDE

Pode ser executado em:

- IntelliJ IDEA
- Eclipse
- NetBeans
- VS Code

---

## 3️⃣ Execute a classe principal

```text
JavaBank.java
```

---

# 📚 Objetivos de Aprendizado

Este projeto foi desenvolvido para praticar:

- Programação Orientada a Objetos
- Interfaces em Java
- Polimorfismo
- Classes Abstratas
- Organização de código
- Estruturas de dados com ArrayList

---

# 👨‍💻 Autor

Desenvolvido por Daniel Dornelas 🚀

---

# ⭐ Considerações Finais

O JavaBank é um projeto acadêmico criado para consolidar conceitos fundamentais de Java e boas práticas de desenvolvimento orientado a objetos.

O sistema demonstra como interfaces podem tornar o código mais flexível, reutilizável e organizado, permitindo que diferentes tipos de conta compartilhem comportamentos de maneira eficiente.
