package pe.edu.tecsup.poo._09.herencia.caso2;

public class Bicicleta {

	// protected : - Permite que las clases hijas puedan
	//               acceder a los atributos
	//             - Permite que las clases que estan 
	//               en el mismo paquete puedan acceder
	//               al atributo
	
	
	protected int velocidadActual;
	protected int velocidadMaxima;
	
	protected int engranajeActual;
	
	protected String nroAro;
	protected String marca;
	protected String modelo;

	
	public void setEngranajeActual(int engranajeActual) {
		this.engranajeActual = engranajeActual;
	}

	public void cambiarLlantas() {
		this.imprimir("Cambiando llantas");
	}

	public void frenar() {
		this.imprimir("Frenando");
	}

	public void cambiarVelocidad(int engranajeActual) {
		this.engranajeActual = engranajeActual;
		this.imprimir("Cambiando velocidad a " + engranajeActual);
	}
	
	private void imprimir(String msg) {		
		System.out.println(msg);
	}
	

}
