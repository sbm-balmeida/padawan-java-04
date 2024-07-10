package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		//Polimorfismo
		ContaCorrente cc = new ContaCorrente(22, 33);
		Conta cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		println(cc);
		println(cp);
		println(cliente);
	}
	
	static void println() {}
	
	static void println(int a) {}
	
	static void println(boolean bool) {}
	
	static void println(Conta conta) {}
	
	static void println(Object refencia) {}
	
}