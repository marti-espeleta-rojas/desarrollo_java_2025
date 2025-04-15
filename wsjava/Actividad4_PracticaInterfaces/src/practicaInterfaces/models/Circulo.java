package practicaInterfaces.models;

public class Circulo implements IFigura, Comparable<IFigura>
{
	private double radio;
	
	public double getRadio() {
		return radio;
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		return 3.14 * (radio * radio);
	}
	
	public double calcularPerimetro() {
		return 2 * 3.14 * radio;
	}
	
	@Override
	public int compareTo(IFigura c) {
		return Double.compare(this.getRadio(), ((Circulo) c).getRadio());
	}
	
	@Override 
	public String toString() {
		return "Radio: " + radio + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
	}
}
