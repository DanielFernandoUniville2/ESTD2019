package Entradas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Algoritmos.Pontos;

public class ReadFiles {
	
	public Float[] ReadFloat(int quantidade) throws NumberFormatException, IOException {
		BufferedReader br;
		Float[] numeros;
		if(quantidade == 100000) {
			 br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\eclipse-workspace\\Projeto\\src\\Arquivos\\numeros_100000.txt")); 
			 numeros = new Float[100000];
		}else {
			 br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\eclipse-workspace\\Projeto\\src\\Arquivos\\numeros_1000000.txt")); 
			 numeros = new Float[1000000];
		}
		
		int count=0;
		while(br.ready()) {
			String linha = br.readLine();
			numeros[count] = Float.parseFloat(linha);
			count++;
		}
		
		br.close();
		return numeros;
	}
	
	public String[] ReadString(int quantidade) throws NumberFormatException, IOException {
		BufferedReader br;
		String[] palavras;
		if(quantidade == 100000) {
			 br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\eclipse-workspace\\Projeto\\src\\Arquivos\\palavras_100000.txt")); 
			 palavras = new String[100000];
		}else {
			 br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\eclipse-workspace\\Projeto\\src\\Arquivos\\palavras_1000000.txt")); 
			 palavras = new String[1000000];
		}
		
		int count=0;
		while(br.ready()) {
			String linha = br.readLine();
			palavras[count] = linha;
			count++;
		}
		br.close();
		return palavras;
	}
	
	public Pontos[] ReadPoints(int quantidade) throws NumberFormatException, IOException {
		BufferedReader br;
		Pontos[] pontos;
		if(quantidade == 100000) {
			 br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\eclipse-workspace\\Projeto\\src\\Arquivos\\objetos_100000.txt")); 
			 pontos = new Pontos[100000];
		}else {
			 br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\eclipse-workspace\\Projeto\\src\\Arquivos\\objetos_1000000.txt")); 
			 pontos = new Pontos[1000000];
		}
		
		int count=0;
		while(br.ready()) {
			String linha = br.readLine();
			String[] aux = linha.split(" ");
			pontos[count] = new Pontos(Float.parseFloat(aux[0]), Float.parseFloat(aux[1]));
			count++;
		}
		br.close();
		return pontos;
	}




}
