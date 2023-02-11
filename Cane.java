
public class Cane 
{
	private String nome;
	private String razza;
	private int eta;
	private float costo;
	
	public Cane(String nome, String razza, int eta, float costo)
	{
		setNome(nome);
		setRazza(razza);
		setEta(eta);
		setCosto(costo);
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
	
	public void setRazza(String razza)
	{
		this.razza = razza;
	}
	public String getRazza()
	{
		return razza;
	}
	
	public void setEta(int eta)
	{
		this.eta = eta;
	}
	public int getEta()
	{
		return eta;
	}
	
	public void setCosto(float costo)
	{
		this.costo = costo;
	}
	public float getCosto()
	{
		return costo;
	}
	
}
