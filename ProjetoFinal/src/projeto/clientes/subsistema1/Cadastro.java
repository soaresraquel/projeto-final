package projeto.clientes.subsistema1;

public class Cadastro {

	public Cadastro() {
		
	}
	
	public static void gravarCliente(String nome, int cpf, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema!\n");
		
		System.out.println("Nome: " + nome);
		System.out.println("CPF: "+ cpf);		
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		
	}
}
