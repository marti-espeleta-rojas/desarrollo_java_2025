package practica05_2.models;

import java.util.ArrayList;

public class Body {
	private Titulo titulo;
	ArrayList<Parrafo> parrafo = null;
	
	public Body(String texto, ArrayList<Parrafo> parrafo)  {
		this.parrafo = parrafo;
		titulo = new Titulo(texto);
	}
	
	public Titulo getTitulo() {
		return titulo;
	}
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	
	@Override 
	public String toString() {
		return "Título: " + titulo + "Párrafos: " + parrafo;
	}

}
