package tarea16Package;

public class Cuartel extends Edificio {

	public Cuartel(String equipo, Posicion posicion) {
		super(equipo, 500, 3000, posicion);
		this.tiempoConstruccion = 60;
	}

	public void recibeDano(int cantidad) {
		this.energia-=cantidad*0.5;
	}
	
}
