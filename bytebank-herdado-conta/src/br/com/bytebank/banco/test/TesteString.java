package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura"; //object literal
		System.out.println("Primeira string: " + nome);
		
		//String outroNome = new String("Alura");		
		//System.out.println(outroNome);
		
		nome.replace("A", "a");
		nome.toLowerCase();
		System.out.println("Testando string: " + nome);
		
		String nomeReplace = nome.replace("A", "a");
		System.out.println("String com replace: " + nomeReplace);
		
		String nomeMaiuscula = nome.toUpperCase();
		System.out.println("String Maiuscula: " + nomeMaiuscula);
	}

}
