package tarea16Package;

public class Unidad {
	protected String equipo;
	protected int costo;
	protected int energia;
	protected Posicion posicion;
	
	public Unidad(String equipo, int costo, int energia, Posicion posicion) {
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
		this.posicion = posicion;
	}
	
	public void recibeDano(int cantidad) {
		this.energia-=cantidad;
	}
	
}
