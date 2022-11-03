/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho2;
/**
 *
 * @author felipe
 */
public class Executor {
	 public static void informaDadosPessoais(Conta conta) {
	    	System.out.println("Nome do titular: "+ conta.pegNome());
	    	System.out.println("Endereço de cobrança: "+ conta.pegEndereco());
	    	System.out.println("CPF : "+ conta.pegCpf());
	    	System.out.println("Idade : "+ conta.pegIdade());
	    	System.out.println("Numero do titular: "+ conta.pegNumeroCelular());
	    	System.out.println("Sálario : "+ conta.pegSalario());
	    }	
    public static void main(String[] args) {
        Conta conta1 = new Conta("Nome", "Rua, bairro, numero da casa", 00000000000, 21, 123456978, 45, 1, 1, "Corrente");
        informaDadosPessoais(conta1);
        Conta conta2 = new Conta("Nome", "Rua, Bairro, numero da casa", 01122565, 27, 478254777, 123540, 1234, 1, "Poupança");
        conta2.botEndereco("Rua, Bairro, numero da casa");
        informaDadosPessoais(conta2);
        

        
    }
}
