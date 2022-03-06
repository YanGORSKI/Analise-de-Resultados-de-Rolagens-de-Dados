package br.dio;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class AnaliseResultadoRolagensDedDados {

	public static void main(String[] args) {

		Random rng = new Random();
		
		//100 rolagens e armazenamentos de d6s em sistema de Map
		System.out.println("--Rolando 100d6--\n");
		Map<String, Double> rolagensDado = new HashMap<>();
		for(int i=0; i<100; i++) {
			int rolagem = rng.nextInt(1, 7);
			rolagensDado.put(String.valueOf(i+1), (double) rolagem);
		}
		
		//iniciadas variáveis de controle
		String r1 = "1: ";
		int n1 = 0;
		String r2 = "2: ";
		int n2 = 0;
		String r3 = "3: ";
		int n3 = 0;
		String r4 = "4: ";
		int n4 = 0;
		String r5 = "5: ";
		int n5 = 0;
		String r6 = "6: ";
		int n6 = 0;
		
		//análise e computação dos resultados
		for (Map.Entry<String, Double> entry: rolagensDado.entrySet()) {
			if(entry.getValue().equals(1.0)) {
				r1 += "■";
				n1 += 1;
			}
			if(entry.getValue().equals(2.0)) {
				r2 += "■";
				n2 += 1;
			}
			if(entry.getValue().equals(3.0)) {
				r3 += "■";
				n3 += 1;
			}
			if(entry.getValue().equals(4.0)) {
				r4 += "■";
				n4 += 1;
			}
			if(entry.getValue().equals(5.0)) {
				r5 += "■";
				n5 += 1;
			}
			if(entry.getValue().equals(6.0)) {
				r6 += "■";
				n6 += 1;
			}
		}
		
		//exibição dos resultados
		System.out.println("--Números rolados--");
		System.out.println(r1 + " ("+n1+")");
		System.out.println(r2 + " ("+n2+")");
		System.out.println(r3 + " ("+n3+")");
		System.out.println(r4 + " ("+n4+")");
		System.out.println(r5 + " ("+n5+")");
		System.out.println(r6 + " ("+n6+")");
		System.out.println("\n--1d6 rolado " + (n1+n2+n3+n4+n5+n6) + " vezes");


	}

}