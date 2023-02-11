
public class Cani
{
	private Cane cani[];
	private int num=0;
		
	public Cani()
	{
		cani = new Cane[200];
	}
	
	public void AddCane(Cane c, int i)
	{
		cani[i].setNome(c.getNome());
		cani[i].setRazza(c.getRazza());
		cani[i].setCosto(c.getCosto());
		cani[i].setEta(c.getEta());
		num++;
	}
	
	public void setCani(Cane[] cani)
	{
		this.cani = cani;
	}
	public Cane[] getCani()
	{
		return cani;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	
	public void Media()
	{
		int somma=0;
		
		for (int i=0; i<cani.length; i++)
		{
			somma += cani[i].getCosto();
		}
		
		System.out.println(somma/cani.length);
	}
	
	public void Costo()
	{
		
	}
}
