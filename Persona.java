
public class Persona 
{
	private String nome;
	private String cognome;
	private Ordine ordini[];
	private int num=0;
	
	public Persona(String nome, String cognome)
	{
		ordini = new Ordine[10];
		for (int i=0; i<ordini.length; i++)
		{
			ordini[i].setCani(null);
		}
		
		setNome(nome);
		setCognome(cognome);
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
	
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
	public String getCognome()
	{
		return cognome;
	}
	
	public void setOrdini(Ordine[] ordini)
	{
		this.ordini = ordini;
	}
	public Ordine[] getOrdini()
	{
		return ordini;
	}
	
	public void AddOrdine(Ordine o, int i)
	{
		ordini[i].setCani(o.getCani());
		num++;
	}
}
