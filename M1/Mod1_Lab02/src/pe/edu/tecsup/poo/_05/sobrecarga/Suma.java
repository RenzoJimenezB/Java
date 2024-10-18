package pe.edu.tecsup.poo._05.sobrecarga;

public class Suma {

    public int sumar() {
        //return a + b + c ;
        return -1;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int[] datos) {

        int sum = 0;
        for (int d : datos) {
            sum += d;
        }
        return sum;
    }

    /**
     *  Varargs
     * @param datos
     * @return
     */
	/*
	public int sumar(int ... datos) {

		int sum = 0;
		for (int d : datos) {
			sum +=d;
		}
		return sum;
	}
	*/

}
