package guias.de.Ayala;

import java.util.ArrayList;

public class TratamientoDatos extends Utilidades {

    //metodo aun no terminado
    public String buscar(ArrayList list, int criterio) {
        String mensaje =null;
        switch(criterio){
            case 1:
                mensaje ="nombre";
                break;
            case 2:
                mensaje = "apellido";
                break;
        }
        System.out.println("Que "+mensaje+" desea encontrar??");
        String encontrar = entrada.nextLine();
        boolean find = false;
        int cuantosEncontrados = 0;
        String encontrado = "El "+mensaje+" '" + encontrar + "' fue encontrado en la posicion : ";
        for (int i = 0; i < list.size(); i++) {
            if (((String)list.get(i)).equals(encontrar)) {
                if (cuantosEncontrados != 0) {
                    encontrado = encontrado + ", ";
                }
                encontrado = encontrado + (i + 1);
                find = true;
                cuantosEncontrados = cuantosEncontrados + 1;
            }
        }
        if (find) {
            return encontrado;
        } else {
            return "Ningun resultado encontrado";
        }
    }
}
