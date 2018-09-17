package guia.de.augusto;

public class Ordenamiento extends Utilidades {

    public Ordenamiento() {
    }

    @Override
    public int[] llenarVector(int vector[]) {
        int temp;
        System.out.println("LLenado de 10 posiciones extras");
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Ingrese un numero para llenar en la posicion numero: " + ((vector.length - 9) + i));
                temp = entrada.nextInt();
            } while (temp == 0);
            vector[((vector.length -10) + i)] = temp;
        }
        return vector;
    }

    public int[] ordenarVector(int vector[]) {
        int burbuja;
        for (int o = 0; o < (vector.length) - 1; o++) {
            for (int i = 0; i < (vector.length) - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    burbuja = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = burbuja;
                }
            }
        }
        mostrar(vector);
        return vector;
    }

    public void mostrar(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El numero en la posicion del vector: " + (i + 1) + " es: " + vector[i]);
        }
    }
}
