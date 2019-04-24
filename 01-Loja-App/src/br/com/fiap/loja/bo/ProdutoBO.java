package br.com.fiap.loja.bo;

import br.com.fiap.loja.to.ProdutoTO;

public class ProdutoBO {
	
	public ProdutoTO consulta(int id) {
		ProdutoTO produto = new ProdutoTO();
	
		switch (id) {
		case 401:
			produto.setDescricao("Camiseta Branca");
			break;
		case 402:
			produto.setDescricao("Camiseta Azul");
			break;
		case 403:
			produto.setDescricao("Camiseta Rosa");
			break;
		default:
			produto.setDescricao("Produto nao encontrado");
		}
		
		return produto;
	}

}
