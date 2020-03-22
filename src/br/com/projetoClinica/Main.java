package br.com.projetoClinica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Main {
	
	Scanner ler = new Scanner(System.in);
	int i = 1;
	List<Animal> ListaDeAnimais = new ArrayList<Animal>();

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
			

	}

	private void start() {
		
		int opcao = 0;
		
		
		
		do {
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
			
			System.out.println("Escolha uma opação: ");
			opcao = ler.nextInt();
			
		
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
		
		}while(opcao>= 1 && opcao <=8);
		
		
		
	}
	
	
	
	public void cadastrarCavalo() {
		
		System.out.println("Digite o nome do Cavalo: ");
	
		ler.nextLine();
		String nome = ler.nextLine();
		Cavalo c = new Cavalo();
		c.setId(i);
		c.setNome(nome);
		System.out.println("Cavalo cadastrado com sucesso.");
		i++;
		
		ListaDeAnimais.add(c);
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
		
		
	}
	
	public void cadastrarGirafa() {
		System.out.println("Digite o nome do Girafa: ");
		
		ler.nextLine();
		String nome = ler.nextLine();
		Girafa g = new Girafa();
		g.setId(i);
		g.setNome(nome);
		System.out.println("Girafa cadastrada com sucesso.");
		i++;
		
		ListaDeAnimais.add(g);
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
	}
	
	
	
	public void listarCavalos() {
		for(Animal animal : ListaDeAnimais) {
			if(animal instanceof Cavalo) {
				System.out.println("Dados do Cavalo: ");
				animal.id(); animal.nome();
			}
		}
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
	}
	
	public void listarGirafas() {
		for(Animal animal : ListaDeAnimais) {
			if(animal instanceof Girafa) {
				System.out.println("Dados da Girafa: ");
				animal.id(); animal.nome();
			}
		}
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
	}
	
	public void listarTodosOsAnimais() {
		for(Animal animal : ListaDeAnimais) {
			System.out.println("\nDados do Animal: ");
			animal.tipo();
			animal.id();
			animal.nome();
			
		}
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
		
	}
	
	public void removerUmAminalPorId() {
		System.out.println("Digite o id do animal a ser removido: ");
		int id = ler.nextInt();
		
		for(Animal animal : ListaDeAnimais) {
			if(animal.getId() == id) {
				ListaDeAnimais.remove(animal);
				System.out.println("Animal removido com sucesso.");
			}else {
				System.out.println("Id nao encontrado");
			}
		}
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
		
	}
	public void exibirQuantidadeDeAnimaisCadastradosPorTipo() {
		int x = 0,y=0,z=0;
		for(Animal a : ListaDeAnimais) {
			if(a instanceof Cavalo) {
				x++;
			}
		}
		System.out.println("Numero de cavalos cadastrados: " + x);
		for(Animal animal : ListaDeAnimais) {
			if(animal instanceof Cavalo) {
				System.out.print("Dados do Cavalo: ");
				animal.id(); animal.nome();
			}
	

		}
		System.out.println("\n");
		for(Animal a : ListaDeAnimais) {
			if(a instanceof Girafa) {
				y++;
			}
		}
		System.out.println("Numero de girafas cadastradas: " + y);
		for(Animal animal : ListaDeAnimais) {
			if(animal instanceof Girafa) {
				System.out.print("Dados da Girafa: ");
				animal.id(); animal.nome();
			}
	

		}
		System.out.println("\n");
		z = x+y;
		System.out.println("Total de animais cadastrados: " + z);
		
		System.out.println("\nPrescione enter para continuar");
		ler.nextLine();
	}
}
