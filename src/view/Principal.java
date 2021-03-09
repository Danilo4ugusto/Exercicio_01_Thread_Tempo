package view;

import java.util.Random;

import controller.ThreadTempo;

public class Principal{

	public static void main(String[] args)
	{
		//Declaração de variaveis
		Random random = new Random();
		int x;
		int vet [] = new int [1000];

		//Vetor com valores aleatorios de 1 a 100
		for (int i = 0; i < vet.length; i++)
		{
			vet[i] = random.nextInt(101);
		}

		//Chamada das Threads
		for (x = 1; x < 3; x++)
		{
			Thread threadTempo = new ThreadTempo(x, vet);
			threadTempo.start();			
		}
	}
}