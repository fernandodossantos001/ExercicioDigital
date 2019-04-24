package br.com.fiap.loja.to;

public class ProdutoTO {
	
	private Long id;
	
	private Double preco;
	
	private Integer quantidade;
	
	private String descricao;
	

	public ProdutoTO(Long id, Double preco, Integer quantidade, String descricao) {
		this.id = id;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}
	
	public ProdutoTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
