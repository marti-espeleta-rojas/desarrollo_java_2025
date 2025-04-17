package practica05_2.main;

import java.util.ArrayList;

import practica05_2.models.Body;
import practica05_2.models.Footer;
import practica05_2.models.Header;
import practica05_2.models.ImpresorCompleto;
import practica05_2.models.ImpresorResumen;
import practica05_2.models.Mensaje;
import practica05_2.models.Parrafo;

public class Principal {

	public static void main(String[] args) {
		Header header = new Header("Header");
		Footer footer = new Footer("Footer");
		Parrafo par = new Parrafo();
		ArrayList<Parrafo> parrafos = new ArrayList<>();
		parrafos.add(par);
		Body body = new Body("Título", parrafos);
		Mensaje m = new Mensaje(footer, body, header);
		
		System.out.println("Prueba Impresor Resumen");
		ImpresorResumen impresorRes = new ImpresorResumen();
		impresorRes.imprimirMensaje(m);
		
		System.out.println("Ahora probamos Impresor Completo");
		ImpresorCompleto ic = new ImpresorCompleto();
		ic.imprimirMensaje(m);
		

	}

}
