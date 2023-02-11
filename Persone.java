
public class Persone 
{
	private Persona persone[];
	private int num=0;
	
	public Persone()
	{
		persone = new Persona[50];
		for (int i=0; i<persone.length; i++)
		{
			persone[i].setNome(null);
			persone[i].setCognome(null);
		}
		
		setNum(num);
	}
	
	public void setPersone(Persona[] p)
	{
		persone = p;
	}
	public Persona[] getPersone()
	{
		return persone;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	
	public void AddPersona(Persona p, int i)
	{
		persone[i].setNome(p.getNome());
		persone[i].setCognome(p.getCognome());
		num++;
	}
}
