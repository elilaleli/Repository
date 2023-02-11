import java.time.LocalDateTime;

public class Ordine 
{
	private Cane cani[];
	private LocalDateTime data;
	private int num=0;
	
	
	public Ordine(Persona p)
	{
		cani = new Cane[10];
		data = LocalDateTime.now();
		
		setCani(cani);
	}
	
	public void setCani(Cane[] c) 
	{
		cani = c;
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

	public void AddCane(Cane c, int i)
	{
		cani[i].setNome(c.getNome());
		cani[i].setRazza(c.getRazza());
		cani[i].setCosto(c.getCosto());
		cani[i].setEta(c.getEta());
		num++;
	}
	
	public void Costo()
	{
		float tot=0;
		
		for (int i=0; i<cani.length; i++)
		{
			tot += cani[i].getCosto();
		}
		
		System.out.print("Costo TOT Ordine: "+tot+"€.");
	}
	
}
