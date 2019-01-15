package br.com.agroftec.email.main;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.agroftec.email.Conect;
import br.com.agroftec.email.ReaderFile;

public class Program {
	public static void main(String args[]) throws FileNotFoundException {
		ReaderFile r = new ReaderFile();
		Conect c = new Conect();
		r.openFile();
		r.readFile();
		try {
			c.getConnection();
			PreparedStatement envio =  ((Connection) c).prepareStatement("INSERT INTO produto(codigo_produto,descricao_produto,preco_produto)");
			
		}
		r.closeFile();

	}
	
}
