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
        if (matinal) {
            return false;
        }
        if (dormido) {
            return false;
        }
        return true;
    }

    public boolean menorPor10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10) {
            return true;
        }
        return false;
    }

    public boolean digitoIgual(int a, int b) {
        int aIzq = a / 10;
        int aDer = a % 10;
        int bIzq = b / 10;
        int bDer = b % 10;
        if (aIzq == bIzq || aIzq == bDer || aDer == bIzq || aDer == bDer){
        return true;
        }
        return false;
    }
    
    public boolean multiploMultiple (int numero){
        if (numero % 3 == 0 && numero % 5 == 0){ //es un multiplo de 3 y de 5 
            return false;
        }
        if (numero % 3 == 0){//el numero es multiplo de 3 ó de 5 pero no 
                             //de los dos por que
            return true;
        }
        return false;
    }

     public boolean menor20(int a) {
        return (a + 1) % 20 == 0 || (a + 2) % 20 == 0;
    }

    public int loteria(int a, int b, int c) {
        if (a == b && b == c && a == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public int dados(int a, int b, boolean dobles) {
        int c = 0;
        c = a + b;

        if (dobles == true && a == b) {
            return c + 1;
        }
        return c;
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
//Testeo 4
        System.out.println("telefono " + ejercicios.telefono(false, true, true));
        System.out.println(ejercicios.telefono(true, false, true));
        System.out.println("telefono " + ejercicios.telefono(true, true, true));
//Testeo 5
        System.out.println("Menor10 " + ejercicios.menorPor10(1, 7, 10));
        System.out.println(ejercicios.menorPor10(1, 7, 11));
        System.out.println("Menor10 " + ejercicios.menorPor10(11, 1, 5));
//Testeo 6
        System.out.println("digitoIgual " + ejercicios.digitoIgual(12,23));
        System.out.println(ejercicios.digitoIgual(1,7));
        System.out.println("digitoIgual " + ejercicios.digitoIgual(1,5));
//Testeo 7
        System.out.println("multiploMultiple (3)" + ejercicios.multiploMultiple(3));
        System.out.println("multiploMultiple (11)" + ejercicios.multiploMultiple(11));
        System.out.println("multiploMultiple (15)" + ejercicios.multiploMultiple(15));
//Testeo 8
        
    }
}
