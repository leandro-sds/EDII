import java.io.IOException;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GeradorDeDados geradorDeDados = new GeradorDeDados();
		 Filme[] filmes = geradorDeDados.aleatorio(2000000);
		//Filme[] filmes = geradorDeDados.crescente(2000000);
		
		
		 ArvoreBusca<Long, Filme> abb = new ArvoreBusca<>();
		//Map<Long,Filme> tablet = new HashMap<>();
		//Map<Long, Filme> arvore = new TreeMap<>();
		//List<Filme> lista = new LinkedList<>();
		//List<Filme> array = new ArrayList<>();
		long inicio, fim;
		//Utiliza esse For para fazer a add dos elementos; 
		//for (Filme filme:filmes){
			//lista.add(filme);
			//array.add(filme);
		//}
		
		//Nova instanciação para limpar a lista a cada nova execução;
		//lista = new LinkedList <>();
		//array = new ArrayList<>();
		inicio = System.currentTimeMillis();
		//For para Adicionar os elementos;
		for (Filme filme : filmes) {
			//tablet.put(filme.getId(), filme);
			//lista.add(filme);
			//array.add(filme);
			//arvore.put(filme.getId(),filme);
			abb.Inserir(filme,filme.getId());
			}
		//For para fazer a listagem, quando for executar comenta todo o resto e deixa apenas ele e o for para add;
		//for(Filme filme: filmes){
			
		//}
		//Adicionar mais um no final da lista
		//lista.add(new Filme(2000001, "Guerra Civil", (byte)2));
		//System.out.println("lista1");
		//System.out.println(abb);
		//For para remover e buscar os elementos
		for(Filme filme:filmes){
			//lista.contains(filme);
			//lista.contains(filme.getId());
			//lista.clear();
			//lista.remove(filme);
			//array.contains(filme);
			//array.contains(filme.getId());
			//array.remove(filme);
			//array.clear();
			//tablet.remove(filme.getId());
			//tablet.clear();
			//tablet.containsValue(filme);
			//tablet.containsKey(filme.getId());
			//arvore.remove(filme.getId());
			//arvore.clear();
			//arvore.containsValue(filme);
			//arvore.containsKey(filme.getId());
			//abb.Buscar(filme);
			abb.remover(filme.getId(), abb.raiz); //o método precisa da raiz, acho tirar que nao foi uma boa solução. deixa assim que funciona
		}
		fim = System.currentTimeMillis();
		//System.out.println("arvore");
		//System.out.println(abb);
		System.out.println(fim - inicio);
		
		
		
	}

}
