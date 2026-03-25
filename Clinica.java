package Clinica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Clinica {

	private Map<Integer, List<Consulta>> 
	consultas = new HashMap<>();
	private Set <Animales> animales = new TreeSet<>();
	
	

	
	public void addAnimal(Animales a) {
		animales.add(a);
	}
	

	public void addConsulta(int id, Consulta con1) {
		if(con1.getId() == id) {
			if(!consultas.containsKey(id)) {
				consultas.put(id, new ArrayList<>());
				
				consultas.get(id).add(con1);
			}
		}
	}
	
	public void perrosByRaza(boolean ascendente) {
	    List<Perro> perrosPorRaza = new ArrayList<>();

	    Iterator<Animales> it = animales.iterator();
	    while (it.hasNext()) {
	        Animales a = it.next();
	        if (a instanceof Perro) {
	            perrosPorRaza.add((Perro) a);
	        }
	    }

	    Collections.sort(perrosPorRaza);

	    if (!ascendente) {
	        Collections.reverse(perrosPorRaza);
	    }
	}
}
