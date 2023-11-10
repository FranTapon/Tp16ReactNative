package tarea16Package;

public class Personaje extends Unidad implements IPosicionable, IMovible {

	public Personaje(String equipo, int costo, int energia, Posicion posicion) {
		super(equipo, costo, energia, posicion);
	}

	@Override
	public void mover(int x, int y) {
		this.posicion.x+=x;
		this.posicion.y+=y;
	}

	@Override
	public int getX() {
		return posicion.x;
	}

	@Override
	public int getY() {
		return posicion.y;
	}

	
	
}
