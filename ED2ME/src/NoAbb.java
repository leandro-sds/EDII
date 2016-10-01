

public class NoAbb<C, T> {
	//Atributos
	private NoAbb<C, T> pai;
	private NoAbb<C, T> esquerdo;
	private NoAbb<C, T> direito;
	private T valor;
	private C chave;
	private int cont;
	
	//Construtor
	
	public NoAbb(T valor, C chave) {
		this.valor = valor;
		this.chave = chave;
		this.cont = cont + 1;
	}
	
	//Getters e Setters

	public NoAbb<C, T> getPai() {
		return pai;
	}

	public void setPai(NoAbb<C, T> pai) {
		this.pai = pai;
	}

	public NoAbb<C, T> getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(NoAbb<C, T> esquerdo) {
		this.esquerdo = esquerdo;
	}

	public NoAbb<C, T> getDireito() {
		return direito;
	}

	public void setDireito(NoAbb<C, T> direito) {
		this.direito = direito;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public C getChave() {
		return chave;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
 
	
	
}
