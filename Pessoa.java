package com.mycompany.trabalho2;

/**
 *
 * @author felipe
 */
public class Pessoa {
	private String nome;
	private String endereco;
	private int cpf;
	private int idade;
	private int numeroCelular;
	private double salario;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String endereco, int cpf, int idade, int numeroCelular, double salario) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.numeroCelular = numeroCelular;
		this.salario = salario;
	}
	public String pegNome() {
            return this.nome;
	}
	public void botNome(String nome) {
            this.nome = nome;
	}
	public String pegEndereco() {
	    return this.endereco;
	}
	public void botEndereco(String endereco) {
            this.endereco = endereco;
	}
	public int pegCpf() {
            return this.cpf;
	}
	public void botCpf(int cpf) {
            this.cpf = cpf;
	}
	public int pegIdade() {
            return this.idade;
	}
	public void botIdade(int idade) {
            this.idade = idade;
	}
	public int pegNumeroCelular() {
            return this.numeroCelular;
	}
	public void botNumeroCelular(int numeroCelular) {
            this.numeroCelular = numeroCelular;
	}
	public double pegSalario() {
            return this.salario;
	}
	public void botSalario(double salario) {
            this.salario = salario;
	}
	
	
}
