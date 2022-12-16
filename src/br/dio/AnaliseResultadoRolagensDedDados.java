package br.dio;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class AnaliseResultadoRolagensDedDados {

	public static void main(String[] args) {

		Random rng = new Random();
		Scanner sc = new Scanner(System.in);
		
		//100 rolagens e armazenamentos de d6s em sistema de Map
		System.out.println("Quantos dados serao rolados?");
		int numeroDados = sc.nextInt();

		System.out.println("Quantos lados terao os dados?");
		int ladosDados = sc.nextInt();

		System.out.println();
		System.out.println("--Rolando " + numeroDados + "d" + ladosDados + "--");
		System.out.println();


		ArrayList<Integer> rolagensDado = new ArrayList<Integer>();
		for(int i=0; i<numeroDados; i++) {
			int rolagem = rng.nextInt(ladosDados)+1;
			rolagensDado.add(rolagem);
			// System.out.println(rolagem);
		}

		String[] graphArr = new String[ladosDados+1];

		for (Integer rolagem : rolagensDado) {
			if (graphArr[rolagem] == null) graphArr[rolagem] = "";
			graphArr[rolagem] += "■";
		}

		for (int i = 1; i < graphArr.length; i++) {
			System.out.println(i + ": " + graphArr[i] + " [" + graphArr[i].length() + "]");
		}
	}
}