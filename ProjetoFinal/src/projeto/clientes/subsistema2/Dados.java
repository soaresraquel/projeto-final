package projeto.clientes.subsistema2;

public class Dados {

private static Dados instancia = new Dados();
	
	private Dados() {
		
	}
	
	public static Dados getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Niterói"; 
	}
	public String recuperarEstado(String cep) {
		return "RJ"; 
	}
}
