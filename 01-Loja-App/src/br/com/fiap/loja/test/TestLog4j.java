package br.com.fiap.loja.test;

import org.apache.log4j.Logger;

public class TestLog4j {
	private static Logger log  = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		log.debug("Debugando o metodo main");
		
		
		System.out.println("O log funcionou");

	}

}
