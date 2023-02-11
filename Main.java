import java.util.*;
import java.io.*;
/*
 * SISTEMA DI GESTIONE DI UN CANILE:
 * Ogni cane ha un nome, un'età, una razza e un costo.
 * Si vuole traccaire la lista delle perosno che sono interessate ad azquiastare una cane
 * ogni persona ha un nome e un cognome.
 * Creare un  programma che chieda all'tente di creare dei cani.
 * Successivamente che stampa a schermo l'età media dell'età dei cani presenti nel canile.
 * Poi si vuole vendere un cane o più cani ad una sola persona(un ordine).
 * Quindi ogni ordine è associato ad una persona e può avere uno o più cani.
 * 
 * --> Aggiungere alla lista dei cani precedentemente creata altri cani letti da un file.
 */

public class Main 
{
	static Scanner scanner = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int i=0;
		Persone persone = new Persone();
		CreaPersoni(persone, i);
		
		Cani cani = new Cani();
		CreaCani(cani, i);
		
		System.out.println("ETA' MEDIA DEI CANI");
		cani.Media();
		
		System.out.println("COSTO TOT DEI CANI");
		cani.Costo();
		
	}
	
	
	public static void CreaPersone(Persone persone, int i)
	{
		boolean add = false;
		
		do
		{
			System.out.println("PERSONA N°"+i+"\nNome: ");
			String nome = scanner.nextLine();
			System.out.print("Cognome: ");
			String cognome = scanner.nextLine();
			
			Persona p = new Persona(nome, cognome);
			persone.AddPersona(p, i);
			
			System.out.println("Vuoi aggiungere un'altra persona?");
			String scelta = scanner.nextLine();
			
			if (scelta.equals("si"))
			{
				add = true;
				i++;
			}
		}
		while(add && (persone.getNum() < persone.getPersone().length));
	}
	
	public static void CreaCani(Cani cani, int i)
	{
		FileReader in = new FileReader("daticani.csv"); //prendi il file e aprilo in lettura
		BufferedReader b = new BufferedReader(in); //metti il file aperto in lettura nel buffer
		
		String s;
		String dati[];
		
		while(true)
		{
			s = b.readLine(); //scansiona 1 riga del buffer
			
			if (s.equals(null))
			{
				break;
			}
			else
			{
				dati = s.split(";");
				Cane c = new Cane(dati[0], dati[1], Integer.parseInt(dati[2]), Float.parseFloat(dati[3]));
				cani.AddCane(c, i);
			}			
		}
	}
		
		/*boolean add = false;
		
		do
		{
			System.out.println("CANE N°"+i+"\nNome: ");
			String nome = scanner.nextLine();
			System.out.print("Razza: ");
			String razza = scanner.nextLine();
			System.out.print("Età: ");
			int eta = sc2.nextInt();
			System.out.print("Costo(€): ");
			float costo = sc2.nextFloat();
			
			Cane c = new Cane(nome, razza, eta, costo);
			cani.AddCane(c, i);
			
			System.out.println("Vuoi aggiungere un altro cane?");
			String scelta = scanner.nextLine();
			
			if (scelta.equals("si"))
			{
				add = true;
				i++;
			}
		}
		while(add && (cani.getNum() < cani.getCani().length));
		*/
	}
}
