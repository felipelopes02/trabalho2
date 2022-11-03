/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho2;
/**
 *
 * @author felipe
 */
public class Conta extends Pessoa {
    private int nConta;
    private double saldo;
    private String tConta;

    public Conta() {
    }
    public Conta(String nome, String endereco, int cpf, int idade, int nCelular, double salario, int nConta, double saldo, String tConta) {
        super(nome, endereco, cpf, idade, nCelular, salario);
        this.nConta = nConta;
        this.saldo = saldo;
        this.tConta = tConta;
    }
    public double pegSaldo() {
        return saldo;
    }
    public void botSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int pegNumeroConta() {
        return nConta;
    }
    public void botNumeroConta(int nConta) {
        this.nConta = nConta;
    }
    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo < valor) {
                System.out.println("O valor é maior que o saldo");
            } else {
                this.saldo = this.saldo - valor;
            }
        } else {
            System.out.println("O saldo é negativo");
        }

    }
      public void depositar(double valor, Conta conta) {
        if (valor > 0) {
            conta.saldo = conta.saldo + valor;
            System.out.println("Depósito concluído.");
        } else {
            System.out.println("Não é possível depositar 0.");
        }
    }
    public void mostranometit() {
        System.out.println("O saldo atual da conta do(a): " + this.pegNome() + " é igual a: " + this.saldo);
    }
    public void transfere(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println("Transferência realizada ");
        } else {
            System.out.println("Não é possível transferir valores negativos");
        }
    }
    public void mostranometitular() {
        System.out.println("Nome do titular: " + this.pegNome());
    }
    public String devolvetConta() {
        return this.tConta;
    }
    public String pegNome() {
        throw new UnsupportedOperationException("Unsupported yet");
    }

}
