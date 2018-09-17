package guias.de.Ayala;

import java.util.ArrayList;

public class TratamientoDatos extends Utilidades {

    //metodo aun no terminado
    public String buscar(ArrayList nombres,ArrayList apellidos) {
        System.out.println("Que nombre o apellido desea encontrar??");
        String encontrar = entrada.nextLine();
        boolean find = false;
        int cuantosEncontrados = 0;
        String encontradoN = "El nombre " + encontrar + " fue encontrado en la posicion : ";
        String encontradoA = "El apellido " + encontrar + " fue encontrado en la posicion : ";
        for (int i = 0; i < nombres.size(); i++) {
            if (((String)nombres.get(i)).equals(encontrar)) {
                if (cuantosEncontrados != 0) {
                    encontradoN = encontradoN + ", ";
                }
                encontradoN = encontradoN + (i + 1);
                find = true;
                cuantosEncontrados = cuantosEncontrados + 1;
            }
        }
        if (find) {
            return encontradoN;
        } else {
            return "Numero no encontrado";
        }
    }
}
