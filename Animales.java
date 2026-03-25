package Clinica;

	abstract class Animales implements contactaPropietario{
	private static int contador=0;
	
	protected int id;
	protected Sexo sexo;
	protected int peso;
	protected Propietario p;
	
	public Animales( Sexo sexo, int peso, Propietario p) {
		
		this.id=contador;
		this.sexo = sexo;
		this.peso = peso;
		this.p = p;
		contador++;
	}


	public int getId() {
		return id;
	}
	private static int getTotalAnimales() {
		return contador;
	}
	
	public abstract void contactaPropietario();
	
}


	
	
