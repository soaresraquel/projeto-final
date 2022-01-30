package projeto.clientes;

import projeto.clientes.subsistema1.Cadastro;
import projeto.clientes.subsistema2.Dados;

public class Cliente {
	
	public void migrarCliente(String nome, int cpf, String cep) {
		String cidade = Dados.getInstancia().recuperarCidade(cep);
		String estado = Dados.getInstancia().recuperarEstado(cep);
		
		Cadastro.gravarCliente(nome, cpf, cep, cidade, estado);
	}

}
