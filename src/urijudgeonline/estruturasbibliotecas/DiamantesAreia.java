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
			
			int diamante = 0;
			for(int l= 0; l < pilha.size(); l++) {
				 if (pilha.get(l).equals("<")) {
	                    conjunto++;
	                } else if (pilha.get(l).equals(">")) {
	                    if (conjunto > 0) {
	                        conjunto--;
	                        diamante++;
	                    }
	                }
			}
			System.out.println(diamante);
		}
		entrada.close();
	}
}