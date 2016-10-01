public class ArvoreBusca<C, T extends Comparable<T> > {
	protected NoAbb<C, T> raiz;
	private int cont;
	
	public void Inserir(T valor, C chave) {
		NoAbb<C, T> no = new NoAbb<C, T>(valor, chave);
		if(this.raiz == null) {
			this.raiz = no;
			this.cont = cont + 1;
		} else {
			NoAbb<C, T> atual = this.raiz;
			NoAbb<C, T> pai;
			while(true) {
				pai = atual;
				if(valor.compareTo(atual.getValor()) < 0) {
					if(atual.getEsquerdo() == null) {
						atual.setEsquerdo(no);
						atual.getEsquerdo().setPai(pai);
						this.cont = cont + 1;
						break;
					} else {
						atual = atual.getEsquerdo();
					}
				} if(valor.compareTo(atual.getValor()) > 0) {
					if(atual.getDireito() == null) {
						atual.setDireito(no);
						atual.getDireito().setPai(pai);
						this.cont = cont+1;
						break;
					} else {
						atual = atual.getDireito();
					}
				}
			}
		}
	}
	
	// Pesquisar na árvore usando um valor como parametro
	public boolean Buscar(T valor) {
		NoAbb<C, T> atual = this.raiz;
		while(atual != null) {
			if(atual.getValor().compareTo(valor) == 1) {
				return true;
			} else {
				if(valor.compareTo(atual.getValor()) < 0) {
					atual = atual.getEsquerdo();
				} else {
					atual = atual.getDireito();
				}
			}
		}
		return false;
	}
	
	//Imprimir a Árvore em ordem
	public void emOrdem(NoAbb<C, T> raiz){
		if(raiz != null){
			emOrdem(raiz.getEsquerdo());
			System.out.println(" " + raiz.getValor() + " " + raiz.getChave());
			emOrdem(raiz.getDireito());
		}
	} 
	

	
	
	@SuppressWarnings("unchecked")
	public NoAbb<C, T> remover(C chave, NoAbb<C, T> raiz){
        if(raiz == null)
            return raiz;   // Item not found; do nothing
        if(((Comparable<C>) chave).compareTo((C) raiz.getChave()) < 0)
            raiz.setEsquerdo(remover( chave, raiz.getEsquerdo()));
        else if(((Comparable<C>) chave).compareTo((C) raiz.getChave()) > 0)
        	raiz.setDireito(remover( chave, raiz.getDireito() ));
        else if(raiz.getEsquerdo() != null && raiz.getDireito() != null)
        {
            raiz.setChave(menor(raiz.getDireito()).getChave());
            raiz.setValor(menor(raiz.getDireito()).getValor());
            raiz.setDireito(remover((C) raiz.getChave(), raiz.getDireito()));
        }
        else
            raiz = (raiz.getEsquerdo() != null) ? raiz.getEsquerdo() : raiz.getDireito();
            this.raiz = raiz;
        return raiz;
    }
	
	private NoAbb<C, T> menor(NoAbb<C, T> raiz){
        if(raiz == null)
            return null;
        else if(raiz.getEsquerdo() == null)
            return raiz;
        return menor(raiz.getEsquerdo());
    }
	
}
	
	
	
	
