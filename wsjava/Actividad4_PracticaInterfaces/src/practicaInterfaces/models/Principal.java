package practicaInterfaces.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		
		List<IFigura> lista = new ArrayList<>(); 
		Rectangulo r1 = new Rectangulo(2.2,4.3); 
		Rectangulo r2 = new Rectangulo(5.3,2);
		Circulo c1 = new Circulo(3.3);
		Circulo c2 = new Circulo(4);
		Cuadrado cuad1 = new Cuadrado(3);
		Cuadrado cuad2 = new Cuadrado(3.5);
		
		lista.add(cuad2);
		lista.add(cuad1);
		lista.add(r1);
		lista.add(r2);
		lista.add(c1);
		lista.add(c2);
		
		Collections.sort(lista);
		
		
		double area;
		
		for (Object obj : lista)
		{
			if (obj instanceof Cuadrado) {
				area = ((Cuadrado) obj).calcularArea();
				System.out.println("Tipo de Figura: Cuadrado");
				System.out.println(String.format("\nÁrea: %.2f", area));
			}
			else {
				if (obj instanceof Circulo) {
					area = ((Circulo) obj).calcularArea();
					System.out.println("Tipo de Figura: Círculo");
					System.out.println(String.format("\nÁrea: %.2f", area));
				}
				else {
					area = ((Rectangulo) obj).calcularArea();
					System.out.println("Tipo de Figura: Rectángulo");
					System.out.println(String.format("\nÁrea: %.2f", area));
				}
			}
		}
		System.out.println("Listo");
	}
}
