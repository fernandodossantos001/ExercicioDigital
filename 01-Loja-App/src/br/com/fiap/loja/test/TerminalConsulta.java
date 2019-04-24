package br.com.fiap.loja.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class TerminalConsulta {

	public static void main(String[] args) {
		int codigo = 0;
		String loja = "Loja-Joazinho";
		Calendar data = Calendar.getInstance();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		String continuar = "sim";
		String camisa = "";

		while (continuar.equals("sim")) {

			JOptionPane.showMessageDialog(null, loja + " " + formatarData.format(data.getTime()),loja, 1);
			
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe um codigo"));

			switch (codigo) {
			case 401:
				camisa = "Camiseta Branca";
				break;
			case 402:
				camisa = "Camiseta Azul";
				break;
			case 403:
				camisa = "Camiseta Rosa";
				break;
			default:
				camisa = "Produto nao encontrado";
			}

			JOptionPane.showMessageDialog(null, camisa, "Status Busca ! ", 1);

			continuar = JOptionPane.showInputDialog("Deseja continuar [sim/nao]");
		}

	}

}
