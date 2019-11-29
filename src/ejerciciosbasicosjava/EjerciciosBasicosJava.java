package ejerciciosbasicosjava;

/**
 *
 * @author Alberto
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana) {
        if (finDeSemana) {
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60) {
            return true;
        }
        return false;
    }

    public int multa(int velocidad, boolean cumple) {
        if (cumple) { //Si es mi cumple, el guardia me quita 5 de velicidad
            velocidad -= 5;
        }
        if (velocidad <= 60) {
            return 0;
        }
        if (velocidad > 60 && velocidad <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public boolean vanidoso(int numero) {
        if (numero % 11 == 0 || numero % 11 == 1) {
            return true;
        }
        return false;
    }

    public boolean telefono(boolean matinal, boolean madre, boolean dormido) {
        if (matinal && madre) {
            return true;
        }
        if (matinal || dormido) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
//Testeo 1
        System.out.println("fiestaArdillas " + ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.println("fiestaArdillas " + ejercicios.fiestaArdillas(70, true));
//Testeo 2
        System.out.println("multa " + ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println("multa " + ejercicios.multa(65, true));
//Testeo 3
        System.out.println("vanidoso " + ejercicios.vanidoso(22));
        System.out.println(ejercicios.vanidoso(23));
        System.out.println("vanidoso " + ejercicios.vanidoso(24));
//Testeo 3
        System.out.println("telefono " + ejercicios.telefono(false, true, true));
        System.out.println(ejercicios.telefono(true, false, true));
        System.out.println("telefono " + ejercicios.telefono(true, true, true));
    }
}
