package br.com.fiap.loja.view;

import javax.swing.JOptionPane;

import br.com.fiap.loja.bo.ProdutoBO;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {
	public static void main(String[] args) {
		ProdutoBO bo = new ProdutoBO();
		
		ProdutoTO produto = bo.consulta(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto")));
		
		JOptionPane.showMessageDialog(null, produto.getDescricao(), "Descricao do produto", 1 );
	}
}
