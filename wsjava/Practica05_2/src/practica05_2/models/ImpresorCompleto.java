package practica05_2.models;

public class ImpresorCompleto implements Impresor 
{
	private String imprimirInfoImpresorCompleto() {
		return "Información especial del impresor completo";
	}
	
	@Override
	public void imprimirMensaje(Mensaje m) {
		System.out.println(m.getHeader().getMensajeHeader());
		System.out.println(this.imprimirSeparador());
		System.out.println(m.getBody());
		System.out.println(this.imprimirSeparador());
		System.out.println(m.getFooter().getMensajeFooter());
		System.out.println(this.imprimirSeparador());
		
		System.out.println(imprimirInfoImpresorCompleto());
	}
	
	private String imprimirSeparador() {
		return "\n";
	}

}
