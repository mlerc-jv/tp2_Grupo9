package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 8, b = 3, c = -5;

        int resA = a + b + c;
        System.out.println("a) a + b + c = " + resA);

        int resB = 2 * b + 3 * (a - c);
        System.out.println("b) 2*b + 3*(a-c) = " + resB);

        double resC = (double) a / b; // casteo explícito para decimales
        System.out.println("c) a / b = " + resC);

        int resD = a % b;
        System.out.println("d) a % b = " + resD);

        double resE = (double) a / c;
        System.out.println("e) a / c = " + resE);

        int resF = a % c;
        System.out.println("f) a % c = " + resF);

        double resG = (double) (a * b) / c;
        System.out.println("g) a*b / c = " + resG);

        double resH = a * ((double) b / c);
        System.out.println("h) a*(b/c) = " + resH);

        int resI = (a * c) % b;
        System.out.println("i) (a*c) % b = " + resI);

        int resJ = a * (c % b);
        System.out.println("j) a*(c%b) = " + resJ);

        int resK = (3 * a - 2 * b) % (2 * a - c);
        System.out.println("k) (3a-2b) % (2a-c) = " + resK);

        int resL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println("l) resultado = " + resL);

        double resM = (double) ((a - 3 * b) % (c + 2 * a)) / (a - c);
        System.out.println("m) resultado = " + resM);

        int resN = a - b - c * 2;
        System.out.println("n) a - b - c*2 = " + resN);
    }
}