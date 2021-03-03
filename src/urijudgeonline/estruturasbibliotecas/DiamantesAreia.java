package urijudgeonline.estruturasbibliotecas;

import java.util.Scanner;
import java.util.Stack;

public class DiamantesAreia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		int conjunto;
		
		Stack<String> pilha = null;
		
		for (int i = 0; i < n; i++) {
			String caracteres = entrada.next();

			String novaCaracters = null;
			for (int j = 0; j < caracteres.length(); j++) {
				if (caracteres.contains(".")) {
					novaCaracters = caracteres.replace(".", "");
				} else {
					novaCaracters = caracteres;
				}
			}

			String elemnts = null;
			conjunto = 0;
			pilha =  new Stack<String>();
			for (int k = 0; k < novaCaracters.length(); k++) {
				elemnts = String.valueOf(novaCaracters.charAt(k));
				pilha.push(elemnts);
			}
			
			for(int l= 0; l < pilha.size(); l++) {
				if(!(pilha.peek().toString() != pilha.get(l).toString())) {
					conjunto++;
					pilha.pop();
				}
			}
			System.out.println(pilha);
			System.out.println(conjunto);
		}
		entrada.close();
	}
}