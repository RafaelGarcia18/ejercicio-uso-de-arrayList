package guias.de.Ayala;

import java.util.Scanner;

public class Utilidades {

    public Utilidades() {
    }

    Scanner entrada = new Scanner(System.in);

    /**
     * Metodo que crea un vector de 100
     *
     * @return Retorna un vector de 100 posiciones
     */
    public int[] crearVector() {
        int[] vector = new int[20];
        return vector;
    }

    /**
     * Metodo que llena un vector exceptuando 10 posiciones;
     *
     * @param vector Recive un vector de tipo int
     * @return Retorna un vecto de tipo int lleno menos 10 posiciones
     */
    public int[] llenarVector(int vector[]) {
        int temp;
        for (int i = 0; i < (vector.length) - 10; i++) {
            do {
                System.out.println("Inserte un numero para el vector en la posicion: " + (i + 1));
                temp = entrada.nextInt();
            } while (temp == 0);
            vector[i] = temp;
        }
        return vector;
    }
}
