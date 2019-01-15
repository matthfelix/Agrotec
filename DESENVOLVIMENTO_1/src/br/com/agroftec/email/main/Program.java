package br.com.agroftec.email.main;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.agroftec.email.Conect;
import br.com.agroftec.email.ReaderFile;

public class Program {
	public static void main(String args[]) throws FileNotFoundException {
		ReaderFile r = new ReaderFile();
		Connection c = Conect.getConnection();
		r.openFile();
		r.readFile();
		try {
			
			PreparedStatement envio =  c.prepareStatement("INSERT INTO produto(codigo_produto,descricao_produto,preco_produto)");
			
		}
		r.closeFile();

	}
	
}
