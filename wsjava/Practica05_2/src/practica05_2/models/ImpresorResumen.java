package practica05_2.models;

public class ImpresorResumen implements Impresor 
{
	@Override
	public void imprimirMensaje(Mensaje mensaje) {
		System.out.println(this.imprimirSeparador());
		System.out.println(mensaje.getHeader().getMensajeHeader());
		System.out.println(this.imprimirSeparador());
		System.out.println(mensaje.getBody().getTitulo());
		System.out.println(this.imprimirSeparador());
		System.out.println(mensaje.getFooter().getMensajeFooter());
		System.out.println(this.imprimirSeparador());
	}
	
	private String imprimirSeparador() {
		return "-----------------------------";
	}
}
