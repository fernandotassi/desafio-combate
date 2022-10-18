package application;

import java.util.*;
import entities.Champion;

public class Program 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);		
			
		System.out.println("Digite os dados do primeiro campeão");
		System.out.print("Nome: ");
		String name = scan.nextLine();
		System.out.print("Vida inicial: ");
		int life = scan.nextInt();
		System.out.print("Ataque: ");
		int attack = scan.nextInt();
		System.out.print("Armadura: ");
		int armor = scan.nextInt();
		System.out.println();
		
		Champion a = new Champion(name, life, attack, armor);
			
		System.out.println("Digite os dados do segundo campeão");
		System.out.print("Nome: ");
		scan.nextLine();
		name = scan.nextLine();
		System.out.print("Vida inicial: ");
		life = scan.nextInt();
		System.out.print("Ataque: ");
		attack = scan.nextInt();
		System.out.print("Armadura: ");
	    armor = scan.nextInt();
	    System.out.println();
		
		Champion b = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos você deseja executar? ");
		int n = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			 a.takeDamage(b);
			 b.takeDamage(a);
			if(a.getLife() > 0 && b.getLife() > 0)
			{		   
		    System.out.println("Resultado do turno " + (i + 1) + ":");
		    System.out.println(a.status());
		    System.out.println(b.status());
		    System.out.println();
			}
			else				
		    if(a.getLife() <= 0)
			{
				a.setLife(0);
				System.out.println("Resultado do turno " + (i + 1) + ":");
				System.out.println(a.status() + " (morreu)");
			    System.out.println(b.status());
			    i = n;
			}
			if(b.getLife() <= 0)
			{
				b.setLife(0);
				System.out.println("Resultado do turno " + (i + 1) + ":");
				System.out.println(a.status());
			    System.out.println(b.status() + " (morreu)");
			    i = n;
			
		    }	    
				
		 }	
		 System.out.println();
		 System.out.println("FIM DO COMBATE!");
		
        scan.close();
	}

}
