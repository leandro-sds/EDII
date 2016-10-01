package netflix;

public class Netflix {
	protected No raiz;
	
	public void InserirFilme(No no) {
		if(this.raiz == null) {
			this.raiz = no;
		} else {
			No atual = this.raiz;
			while(true) {
				if(no.getAvaliacao() <= atual.getAvaliacao()) {
					if(atual.getEsquerdo() == null) {
						atual.setEsquerdo(no);
						break;
					} else {
						atual = atual.getEsquerdo();
					}
				} if(no.getAvaliacao() > atual.getAvaliacao()) {
					if(atual.getDireito() == null) {
						atual.setDireito(no);
						break;
					} else {
						atual = atual.getDireito();
					}
				}
			}
		}
	}
	
	public void BuscarAtor(String ator) {
			No atual = this.raiz;
			BuscarAtorNo(atual, ator);
	}
	
	private void BuscarAtorNo(No no, String ator) {
		if(no != null){
			BuscarAtorNo(no.getEsquerdo(), ator);
			if(no.containsPessoas(ator)) {
				System.out.println(no.getTitulo());
			}
			BuscarAtorNo(no.getDireito(), ator);
		}
	}
	
	public void BuscarCategoria(String categoria) {
		No atual = this.raiz;
		BuscarCategoriaNo(atual, categoria);
	}
	
	private void BuscarCategoriaNo(No no, String categoria) {
		if(no != null){
			BuscarCategoriaNo(no.getEsquerdo(), categoria);
			if(no.containsCategoria(categoria)) {
				System.out.println(" " + no.getTitulo());
				return;
			}
			BuscarCategoriaNo(no.getDireito(), categoria);
		}
	}
	
	public void BuscarTitulo(String titulo) {
		No atual = this.raiz;
		BuscarTituloNo(atual, titulo);
	}
	
	private void BuscarTituloNo(No no, String titulo) {
		if(no != null){
			BuscarTituloNo(no.getEsquerdo(), titulo);
			if(no.getTitulo().equals(titulo)) {
				System.out.println(" " + no.getTitulo());
				return;
			}
			BuscarTituloNo(no.getDireito(), titulo);
		}
	}
	
	public void emOrdem(int ava){
		No atual = this.raiz;
		emOrdemNo(atual, ava);
	}
	
	private void emOrdemNo(No no, int ava){
		if(no != null){
			emOrdemNo(no.getEsquerdo(), ava);
			if(no.getAvaliacao() >= ava){
				System.out.println(" " + no.getTitulo() + " " + no.getAvaliacao());
			}
			emOrdemNo(no.getDireito(), ava);
		}
	}
}
