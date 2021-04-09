package nodo;

public class Ciudad extends Nodo {

	public Ciudad(String nombre) {
		super(nombre);
	}

	@Override
	public void funcInfoGeo() {
		System.out.println("Implementacion de nodo ciudad");
	}

}
