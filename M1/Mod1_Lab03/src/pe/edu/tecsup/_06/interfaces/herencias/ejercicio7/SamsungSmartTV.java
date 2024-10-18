package pe.edu.tecsup._06.interfaces.herencias.ejercicio7;

public abstract class SamsungSmartTV implements FuncionalidadesSmartTV {
    public abstract void soportarIA();

    public void cambiarEncriptacion() {
        System.out.println("Cambiando encriptacion");
    }

    @Override
    public void accederAInternet() {
        System.out.println("Acceder a interner...");
    }

    @Override
    public void ejecutarAplicaciones() {
        System.out.println("Ejecutar aplicaciones...");
    }

    @Override
    public void programarAlarmas() {
        System.out.println("Programar alarmas...");
    }
}
