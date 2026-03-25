package Clinica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Consulta {
	private LocalDate fechaConsulta;
	private String diagnostico;
	private int id;
	List<Medicamento> medicamentos;

	Consulta(LocalDate fechaConsulta, int id, String diagnostico) {
		this.fechaConsulta = fechaConsulta;
		this.diagnostico = diagnostico;
		this.id = id;
		medicamentos = new ArrayList<>();
	}

	void addMedicamento(Medicamento m) {
		medicamentos.add(m);
	}

	boolean removeMedicamentos(String nombreMedicamento) {
		Iterator<Medicamento> it = medicamentos.iterator();
		boolean eliminado = false;
		while (it.hasNext()) {
			Medicamento m = it.next();
			if (m.getNombre().equalsIgnoreCase(nombreMedicamento)) {
				it.remove();
				eliminado = true;
			}
		}
		return eliminado;
	}
}
