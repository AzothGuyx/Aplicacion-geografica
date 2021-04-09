package nodo;

import java.util.ArrayList;
import java.util.List;

import enlace.Enlace;

public abstract class Nodo {
	
	private String nombre;
	private List<Enlace> enlacesNodos;

	public abstract void funcInfoGeo();
	
	public Nodo(String nombre) {
		this.nombre = nombre; 
		enlacesNodos = new ArrayList<>();
	}
	
	

	public List<Enlace> getEnlaceNodo() {
		return enlacesNodos;
	}


	public void agreagarEnlacesNodos2(Nodo nodoOrigen,Nodo nodoDestino) {
		
		this.enlacesNodos.add(new Enlace(nodoOrigen,nodoDestino));
	}
	
	public void agreagarEnlacesNodos(Nodo nodoDestino) {
		
		this.enlacesNodos.add(new Enlace(this,nodoDestino));
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

	
	
	
	
}
