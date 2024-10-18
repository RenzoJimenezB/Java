package pe.edu.tecsup.poo._03.metodos;

/**
 * Clase para metodos matematicos
 *
 * @author mbtec22
 */
public class Matematica {

    // Atributos

    int a;
    int b;

    /**
     * Metodo que no retorna valores
     */
    public void imprimirValores() {

        System.out.println("Valor de 'a' es " + a);
        System.out.println("Valor de 'b' es " + b);

    }


    /**
     * Metodo que retorna un valor
     *
     * @return
     */
    public int sumar() {
        return a + b;
    }

    /**
     * Metodo que retorna un valor
     *
     * @return
     */
    public int resta() {
        return a - b;
    }

    /**
     * Metodo que retorna un valor
     *
     * @return
     */
    public int mult() {
        return a * b;
    }


    /**
     * Metodo que retorna un valor
     *
     * @return
     */
    public float div() {

        return (float) a / b;
        
		/*
		BigDecimal divFix = BigDecimal.valueOf(div);
		divFix  = divFix.setScale(2,RoundingMode.DOWN);
		div = divFix.floatValue();
		return div;
		//*/
    }

    /**
     * Metodo que recibe un parametro
     *
     * @param nro
     * @return
     */
    public int cuadrado(int nro) {

        return nro * nro;

    }

}
