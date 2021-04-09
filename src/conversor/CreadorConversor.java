package conversor;

import grafo.Grafo;

public class CreadorConversor {

	private Grafo grafo;
	
	private String formato;
	
	
	public CreadorConversor(Grafo grafo, String formato) {
		this.grafo = grafo;
		this.formato = formato;
	}
	
	public void exportarGrafo() {
		switch (this.formato) {
		case "XML":
			IConversor xml = new ConversorXml();
			xml.exportar(this.grafo);
			break;

		case "JSON":
			IConversor json = new ConversorXml();
			json.exportar(this.grafo);
			break;
			
		default:
			System.out.println("Error! formato no identificado");
			break;
		}
	}
	
	

	
	
	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
	
}
