package br.com.projetoClinica;

import java.util.Scanner;

public class Main {
	
	Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
			

	}

	private void start() {
		
		int opcao = 0;
		
		
		while(opcao != 8) {
			
			System.out.println("------------------");
			System.out.println("1 - Cadastrar Cavalo");
			System.out.println("2 - Cadastrar Girafa");
			System.out.println("3 - Listar Cavalos");
			System.out.println("4 - Listar Girafas");
			System.out.println("5 - Listar Todos os Animais");
			System.out.println("6 - Remover um Animal por Id");
			System.out.println("7 - Exibir a Qunatidade de Animais Castrados por Tipo");
			System.out.println("8 - Sair");
			System.out.println("------------------");
			
			opcao = ler.nextInt();
			
		try {
			switch (opcao) {
			case 1: cadastrarCavalo();
				
				break;
			case 2: cadastrarGirafa();
			
				break;
			case 3: listarCavalos();
			
				break;
			case 4: listarGirafas();
			
				break;
			case 5: listarTodosOsAnimais();
			
				break;
			case 6: removerUmAminalPorId();
			
				break;
			case 7: exibirQuantidadeDeAnimaisCadastradosPorTipo();
			
				break;
			case 8: System.out.println("Saindo.....");
			
				break;
			}
		} catch (Exception e) {
			System.out.println("Nenhum valor valido foi digitado!");
		}
		
		
		}
		
	}
	
	public void cadastrarCavalo() {
		
	}
	
	public void cadastrarGirafa() {
		
	}
	
	public void listarCavalos() {
		
	}
	
	public void listarGirafas() {
		
	}
	
	public void listarTodosOsAnimais() {
		
	}
	
	public void removerUmAminalPorId() {
		
	}
	public void exibirQuantidadeDeAnimaisCadastradosPorTipo() {
		
	}


}
