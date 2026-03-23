package Clinica;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {

	private String nombre;
	private int gramos;
	private double precio;
	List<Medicamento> m;
	
	
	public Medicamento(String nombre, int gramos, double precio) {
		this.nombre = nombre;
		this.gramos = gramos;
		this.precio = precio;
		m = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getGramos() {
		return gramos;
	}

	public void addMedicamento(Medicamento medicamento) {
	m.add(medicamento);
	}
	
	boolean removeMedicamento(String nombreMedicamento) {
		if 
	}
}
