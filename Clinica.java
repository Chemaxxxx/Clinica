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

	public Set<Consulta> getConsultas(int idAnimal) throws AnimalNoEncontradoException {
		if (!consultas.containsKey(idAnimal)) {
		throw new AnimalNoEncontradoException("Animal no encontrado");
		}

		return new LinkedHashSet<>(consultas.get(idAnimal));
		}
	
	

		public List<Medicamento> getMedicamentosByPeso(Consulta c) {
		List<Medicamento> meds = new ArrayList<>(c.getMedicamentos());

		meds.sort((m1, m2) -> Integer.compare(m2.getGramos(), m1.getGramos()));

		return meds;
		}
		
		

		public Set<Medicamento> getMedicamentosByAnimal(int idAnimal,
		LocalDate inicio,
		LocalDate fin)
		throws AnimalNoEncontradoException {

		if (!consultas.containsKey(idAnimal)) {
		throw new AnimalNoEncontradoException("Animal no encontrado");
		}

		
		Set<Medicamento> resultado = new LinkedHashSet<>();

		for (Consulta c : consultas.get(idAnimal)) {
		if (!c.getFecha().isBefore(inicio) && !c.getFecha().isAfter(fin)) {
		for (Medicamento m : c.getMedicamentos()) {
		resultado.add(m);
		}
	}
		
}

		return resultado;
		}

		public Map<Propietario, List<Animal>> mapAnimalesByPropietario() {
		Map<Propietario, List<Animal>> mapa = new HashMap<>();

		for (Animal a : animales) {
		if (a.propietario != null) {
		mapa.computeIfAbsent(a.propietario, k -> new ArrayList<>()).add(a);
		}
		}

		return mapa;
		}

		public Set<Animal> getAnimalesSinConsultas() {
		Set<Animal> resultado = new HashSet<>();

		for (Animal a : animales) {
		if (!consultas.containsKey(a.getId())) {
		resultado.add(a);
		}
		}

		return resultado;
		}

		public void addConsulta(int idAnimal, Consulta c) {
		consultas.computeIfAbsent(idAnimal, k -> new ArrayList<>()).add(c);
		
		}
	}