package netflix;

public class App {

	public static void main(String[] args) {
		No filme = new No("dasda", "iar", "medo", 5);
		No filme2 = new No("inferno", "inferno", "medo", 5);
		No filme3 = new No("tutu", "tutu", "medo", 5);
		No filme4 = new No("arroz", "ovo", "medo", 5);
		No filme5 = new No("presunto", "quejo", "medo", 5);
		No filme6 = new No("arroba", "arroba", "medo", 5);
		No filme7 = new No("fejao", "ceu", "medo", 5);
		
		Netflix net = new Netflix();
		net.InserirFilme(filme);
		net.InserirFilme(filme2);
		net.InserirFilme(filme3);
		net.InserirFilme(filme4);
		net.InserirFilme(filme5);
		net.InserirFilme(filme6);
		net.InserirFilme(filme7);
		
		
		net.BuscarAtor("iar");
		net.BuscarAtor("inferno");
		net.BuscarAtor("tutu");
		net.BuscarAtor("ovo");
		net.BuscarAtor("quejo");
		net.BuscarAtor("arroba");
		net.BuscarAtor("ceu");

	}

}
