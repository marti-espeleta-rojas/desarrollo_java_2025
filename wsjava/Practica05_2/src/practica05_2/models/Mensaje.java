package practica05_2.models;

//import java.util.Date;

public class Mensaje {
	//private Date fecha;
	private Footer footer;
	private Body body;
	private Header header;
	
	public Mensaje(Footer footer, Body body, Header header) 
	{
		//this.fecha = fecha;
		this.footer = footer;
		this.body = body;
		this.header = header;
	}
	
	//public Date getFecha() {
	//	return fecha;
	//}

	public Footer getFooter() {
		return footer;
	}


	public Body getBody() {
		return body;
	}

	public Header getHeader() {
		return header;
	}
	
	
}