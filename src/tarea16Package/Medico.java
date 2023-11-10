package tarea16Package;

public class Medico extends Personaje{

	public Medico(String equipo, Posicion posicion) {
		super(equipo, 40,100, posicion);
		}

	
	public void recibeDano(int cantidad) {
		this.energia-=cantidad*1.5;
	}
	
	
}
