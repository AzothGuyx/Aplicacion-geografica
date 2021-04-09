package enlace;

import nodo.Nodo;

public class Enlace {

	
	private Nodo origen;
	
	private Nodo destino;
	
	
	public Enlace(Nodo origen,Nodo destino) {
		this.origen= origen;
		this.destino= destino;
	}

	public Nodo getOrigen() {
		return origen;
	}

	public void setOrigen(Nodo origen) {
		this.origen = origen;
	}

	public Nodo getDestino() {
		return destino;
	}

	public void setDestino(Nodo destino) {
		this.destino = destino;
	}
	
	
	
	
}
