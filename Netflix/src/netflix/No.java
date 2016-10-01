package netflix;

import java.util.ArrayList;
import java.util.Random;

public class No {
	private No esquerdo;
	private No direito;
	
	private String titulo;
	private int id;
	private ArrayList<String> pessoas = new ArrayList<String>();
	private ArrayList<String> categoria = new ArrayList<String>();
	private int avaliacao;
	
	Random gerarId = new Random();
	
	public No(String titulo, String pessoa, String categoria, int avaliacao) {
		this.titulo = titulo;
		this.pessoas.add(pessoa);
		this.categoria.add(categoria);
		this.avaliacao = avaliacao;
		this.id = gerarId.nextInt(100) + 10;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPessoas(String pessoas) {
		int i = this.pessoas.indexOf(pessoas);
		return this.pessoas.get(i);
	}
	
	public boolean containsPessoas(String pessoa) {
		return this.pessoas.contains(pessoa);
	}

	public void setPessoas(ArrayList<String> pessoas) {
		this.pessoas = pessoas;
	}
	
	public boolean containsCategoria(String categoria) {
		return this.categoria.contains(categoria);
	}

	public String getCategoria(String categoria) {
		int i = this.categoria.indexOf(categoria);
		return this.categoria.get(i);
	} 

	public void setCategoria(String categoria) {
		this.categoria.add(categoria);
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getId() {
		return id;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	
}
