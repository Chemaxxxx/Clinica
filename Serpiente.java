package Clinica;

public class Serpiente extends Animal {
private EspecieSerpiente especie;
private boolean venenosa;

public Serpiente(EspecieSerpiente especie, boolean venenosa, Sexo sexo, int peso, Propietario propietario) {
	super(sexo, peso,propietario);
	this.especie = especie;
	this.venenosa = venenosa;
}

@Override
public void contactarPropietario() {
}
System.out.println("Contactando al propietario de la serpiente");

}
	
}
