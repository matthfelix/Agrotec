package br.com.agroftec.email;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFile {
	private Scanner html;


	
	public void openFile() throws FileNotFoundException {
		html = new Scanner(new File("/home/ti/Documentos/teste.html"));
	}
	public void readFile() {
		while(html.hasNext()) {
			String a = html.next() + "+";
			System.out.print(a);
		}
	}
	public void closeFile() {
		html.close();
	}
	
}
