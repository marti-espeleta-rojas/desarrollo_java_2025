package practicaInterfaces.models;

public class Cuadrado extends Rectangulo
{

	public Cuadrado(double lado) {
		super(lado, lado);
	}
	
	@Override
	public String toString() {
		return "Lado: " + super.getAncho() + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
	}
}
