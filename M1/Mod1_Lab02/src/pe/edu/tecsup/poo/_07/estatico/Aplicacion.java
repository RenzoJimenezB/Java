package pe.edu.tecsup.poo._07.estatico;


public class Aplicacion {


    public static void main(String[] args) {


        int valor1 = 5;
        Formato fmt = new Formato();
        fmt.imprimir(valor1);

        int valor2 = 5;
        Formato.imprimir(valor2);


    }

}
