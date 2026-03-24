package Clinica;

abstract class Domestico extends Animales {

	protected String nombre;
	protected int edad;
	protected String raza;
	protected String chip;
	
	public Domestico(String nombre, int edad, String raza, String chip,Sexo sexo, int peso, Propietario p) {
		super(sexo, peso, p);
	this.nombre=nombre;
	this.edad=edad;
	this.raza=raza;
	this.chip=chip;
	}











	






	

	
	public abstract void cortarUnas();
	
	
	

}
