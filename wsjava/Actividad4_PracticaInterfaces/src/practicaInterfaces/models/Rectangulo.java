package practicaInterfaces.models;

public class Rectangulo implements IFigura, Comparable<IFigura>
{
	private double largo;
	private double ancho;
	
	public Rectangulo(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public double getAncho() {
		return ancho;
	}
	
	public double calcularArea() {
		return (largo * ancho) * 2;
	}


	public double calcularPerimetro() {
		return (largo * 2) + (ancho * 2);
	}

	@Override
	public int compareTo(IFigura r) {
		return Double.compare(this.calcularArea(), r.calcularArea());
	}
	
	@Override
	public String toString() {
		return "Ancho: " + ancho + " \nLargo: " + largo + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
	}

}
