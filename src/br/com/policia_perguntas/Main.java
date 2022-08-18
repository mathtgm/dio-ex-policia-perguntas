package br.com.policia_perguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> perguntas = new ArrayList<String>();
		int pontuacao = 0;
		Scanner resposta = new Scanner(System.in);
		
		perguntas.add("Telefonou para v�tima?");
		perguntas.add("Este no local do crime?");
		perguntas.add("Mora perto da v�tima?");
		perguntas.add("Devia para a v�tima?");
		perguntas.add("J� trabalhou com a v�tima?");
		
		System.out.println("########### PERGUNTAS DA POLICIA ###########");
		System.out.println("A perguntas devem ser respondidas com \"S\" ou \"N\"");
		
		for (String pergunta : perguntas) {
			System.out.println(pergunta);
			if(resposta.nextLine().toUpperCase().equals("S")) {
				pontuacao++;
			}
		}
		
		resposta.close();
		
		if(pontuacao == 0 ) {
			System.out.println("Inocente");
		} else if(pontuacao == 2) {
			System.out.println("Suspeita");
		} else if(pontuacao == 3 || pontuacao == 4) {
			System.out.println("C�mplice");
		} else if(pontuacao == 5) {
			System.out.println("Assassina");
		}
		
	}

}
