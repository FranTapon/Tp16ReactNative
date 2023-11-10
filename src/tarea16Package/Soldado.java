package tarea16Package;

public class Soldado extends Personaje implements IHostil {

	public Soldado(String equipo,Posicion posicion) {
		super(equipo, 100,500, posicion);
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDano(50);

	}

}
