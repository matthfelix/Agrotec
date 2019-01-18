package br.com.agroftec.email.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.agroftec.email.Conect;
import br.com.agroftec.email.ReaderFile;

public class Program {
	public static void main(String args[]) throws Exception {
		ReaderFile r = new ReaderFile();
		Connection c = Conect.getConnection();
		r.openFile();
		r.readFile();
		try {
			
			PreparedStatement envio =  c.prepareStatement("INSERT INTO produto(codigo_produto,descricao_produto,preco_produto) VALUES (2,'"+r.lido+"',12)");
			envio.execute();
			System.out.print("Enviado com sucesso");
			
		}
		catch(Exception t) {
			System.out.print(t);
		}
		r.closeFile();

	}
	
}
