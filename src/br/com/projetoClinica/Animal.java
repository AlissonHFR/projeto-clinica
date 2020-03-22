package br.com.projetoClinica;

public abstract class Animal {
	
	
	private int id;
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void id() {
		System.out.print("Id: " + getId()+" | ");
	}
	
	public void nome() {
		System.out.print("Nome: " + getNome()+" | ");
	}
	public void tipo() {
		
	}
	
}
