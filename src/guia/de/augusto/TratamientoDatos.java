package guia.de.augusto;

public class TratamientoDatos extends Ordenamiento {

    public int[] borrar(int vector[]) {
        int pos;
        do {
            System.out.println("Ingrese la posicion de el vector la cual desea eliminar");
            pos = entrada.nextInt();
        } while (pos <= 0 || pos > vector.length);
        System.out.println("El numero en la posicion: " + pos + " es: " + vector[pos - 1] + "\nRealmente desea eliminarlo??\n1.Si     2.NO");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            if (pos != vector.length) {
                for (int i = (pos - 1); i < (vector.length - 2); i++) {
                    vector[i] = vector[i + 1];
                }
            }
            vector[vector.length - 1] = 0;
        } else {
            System.out.println("Eliminacion cancelada");
        }
        return vector;
    }

    public int[] agregar(int[] vector) {
        int temp;
        if (vector[vector.length - 1] == 0) {
            int pos = 0;
            for (int i = 0; i < (vector.length - 1); i++) {
                if (vector[i] == 0) {
                    pos = i;
                    break;
                }
            }
            do {
                System.out.println("Ingrese el nuevo valor a agregar al vector");
                temp = entrada.nextInt();
            } while (temp == 0);
            vector[pos] = temp;
        } else {
            int opcion;
            System.out.println("Vector lleno\nDesea eliminar una posicion para seguir agregando\n1.Si       2.No");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                vector = borrar(vector);
            } else {
                System.out.println("Agregar posicion cancelada");
            }
        }
        return vector;
    }

    public String buscar(int[] vector) {
        System.out.println("Que numero desea encontrar??");
        int encontrar = entrada.nextInt();
        boolean find = false;
        int cuantosEncontrados = 0;
        String encontrado = "El numero " + encontrar + " fue encontrado en la posicion : ";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == encontrar) {
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
            return "Numero no encontrado";
        }
    }
}
