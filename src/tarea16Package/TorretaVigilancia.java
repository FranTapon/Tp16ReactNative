package tarea16Package;

public class TorretaVigilancia extends Edificio implements IHostil {

	public TorretaVigilancia(String equipo, Posicion posicion) {
		super(equipo,200,2000,posicion);
		this.tiempoConstruccion = 40;
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDano(10);
	}

}
