package pe.edu.tecsup.poo._09.herencia.caso2;

public class BicicletaCarrera extends Bicicleta{

	private String materialAro;
	
	public void correr() {
		if(this.materialAro != null) {
			System.out.println("Iniciar la carrera...");
			if(this.engranajeActual > 0) {
				System.out.println("Inicio el recorrido...");
			}
		}
	}
	
}
