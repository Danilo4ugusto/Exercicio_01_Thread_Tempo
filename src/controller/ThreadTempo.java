package controller;

public class ThreadTempo extends Thread
{
	//Declara��o de Variaveis
	private int x;
	private int vet [] = new int [1000];
	
	//M�todo construtor
	public ThreadTempo(int x, int vet [])
	{
		this.x = x;
		this.vet = vet;
	}
	
	//M�todo RUN chamando o m�todo contador()
	@Override
	public void run()
	{
		contador();
	}
	
	//Fun��o para determinar se � par ou impar
	public boolean ePar(int x)
	{
		if (x % 2 == 0)
		{			
			return true;
		}
		
		return false;
	}
	
	//M�todo contador, que percorre o vetor e retorna o tempo.
	public void contador()
	{
		double tempoInicial, tempoFinal, total;
		String tipo;
		
		tempoInicial = System.nanoTime();
		
		if (ePar(x))
		{
			tipo = "for";
			for (int i = 0 ; i < vet.length; i++)
			{
				
			}
		}
		else
		{
			tipo = "foreach";
			for (int j : vet)
			{
				j = j + 0;
			}
		}
		
		tempoFinal = System.nanoTime();
		
		total = tempoFinal - tempoInicial;
		total = total / Math.pow(10, 9);
		
		System.out.println("TID #"+ getId() +" --> tipo usado: " + tipo + ", tempo total: " + total + "s.");
	}
	
}