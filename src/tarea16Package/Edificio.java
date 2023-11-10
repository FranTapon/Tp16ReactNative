package tarea16Package;

public class Edificio extends Unidad implements IConstruible, IPosicionable {

	public int tiempoConstruccion;
	
	public Edificio(String equipo, int costo, int energia, Posicion posicion) {
		super(equipo, costo, energia, posicion);
	}

	@Override
	public int getX() {
		return posicion.x;
	}

	@Override
	public int getY() {
		return posicion.y;
	}

	@Override
	public int getTiempoConstruccion() {
		return this.tiempoConstruccion;
	}

}
