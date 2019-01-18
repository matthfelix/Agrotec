package br.com.agroftec.email;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFile {
	private Scanner html;
	public String lido;

	
	public void openFile() throws FileNotFoundException {
		html = new Scanner(new File("/home/ti/Documentos/teste.html"));
	}
	public void readFile() {
		String b = "";
		while(html.hasNext()) {
			b += html.next() + "+";
		}
		this.lido = b;
		
	}
	public void closeFile() {
		html.close();
	}
	
}
