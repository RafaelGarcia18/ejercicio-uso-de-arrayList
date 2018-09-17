package guias.de.Ayala;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {

    public Utilidades() {
    }

    Scanner entrada = new Scanner(System.in);

    public void mostrarArraylist(ArrayList arrayN, ArrayList arrayA) {
        if (arrayN.size() == arrayA.size()) {
            for (int i = 0; i < arrayN.size(); i++) {
                System.out.println("El nombre en la posicion # " + (i + 1) + " es: " + arrayN.get(i)+" y su apellido es: "+arrayA.get(i));
            }
        }
    }

}
