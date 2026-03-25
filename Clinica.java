package Clinica;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clinica {

	private Map<Integer, List<Consulta>> 
	consultas = new HashMap<>();
	private List <Animales> animales = new ArrayList<>();
	
	abstract class Animales implements contactaPropietario{
	private static int contador=0;
	
	protected int id;
	protected Sexo sexo;
	protected int peso;
	protected Propietario p;
	
	public Animales(int id, Sexo sexo, int peso, Propietario p) {
		
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

}
