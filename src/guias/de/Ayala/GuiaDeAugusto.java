package guias.de.Ayala;

import java.util.ArrayList;
import java.util.Scanner;

public class GuiaDeAugusto {

    public static void main(String[] args) {
        int opciones, tamano;
        Scanner entrada = new Scanner(System.in);
        Utilidades u = new Utilidades();
        String temp;
        TratamientoDatos t = new TratamientoDatos();
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> apellidos = new ArrayList();
        do {
            System.out.println("Ingrese la opcion deseada\n1.Llenar arraylist\n2.Llenar n posiciones mas\n3.Mostrar datos en arrayList\n4.Ordenar arrayList\n5.Agregar un dato al arrayList\n6.Borrar posicion en arrayList\n7.Buscar dato en el arrayList");
            opciones = entrada.nextInt();
            switch (opciones) {
                case 1:
                    do {
                        System.out.println("De que tamaño quiere su arraylist");
                        tamano = entrada.nextInt();
                    } while (tamano <= 0);
                    for (int i = 0; i < tamano; i++) {
                        System.out.println("Ingrese el nombre de la persona #: " + (nombres.size() + 1));
                        temp = entrada.nextLine();
                        nombres.add(temp);
                        System.out.println("Ingrese el apellido de la persona#: " + (apellidos.size() + 1));
                        temp = entrada.nextLine();
                        apellidos.add(temp);
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Ingrese cuantas posiciones mas desea llenar");
                        tamano = entrada.nextInt();
                    } while (tamano <= 0);
                    for (int i = 0; i < tamano; i++) {
                        System.out.println("Ingrese el nombre de la persona#: " + (nombres.size() + 1)+"");
                        nombres.add(entrada.nextLine());
                        System.out.println("Ingrese el apellido de la persona#: " + (apellidos.size() + 1));
                        apellidos.add(entrada.nextLine());
                    }
                    break;
                case 3:
                    System.out.println("Mostrar valores en los arrayList");
                    u.mostrarArraylist(nombres, apellidos);
                    break;
                case 4:
//                    vector2 = o.ordenarVector(vector);
                    System.out.println("aun no funciona wee :v");
                    break;
                case 5:
                    System.out.println("Agregar una posicion a los ArrayList");
                    System.out.println("Ingrese un nombre para el arrayList en la posicion: " + (nombres.size() + 1));
                    nombres.add(entrada.nextLine());
                    System.out.println("Ingrese un apellido para el arrayList en la posicion: " + (apellidos.size() + 1));
                    break;
                case 6:
                    System.out.println("Borrar posicion en arrayList");
                    System.out.println("Ingrese la posicion del arrayList que desea boorar");
                    nombres.remove((entrada.nextInt() - 1));
                    apellidos.remove((entrada.nextInt() - 1));
                    break;
                case 7:
                    System.out.println("Buscar nombres o apellidos");
                    int opcionNombre;
                    boolean error = false;
                    do {
                        if (error) {
                            System.out.println("Opcion incorrecta ingrese una opcion correcta");
                        }
                        System.out.println("Que desea buscar\n1. Nombres\n2. Apellidos");
                        opcionNombre = entrada.nextInt();
                        error = true;
                    } while (opcionNombre < 1 || opcionNombre > 2);
                    switch (opcionNombre) {
                        case 1:
                            System.out.println(t.buscar(nombres, 1));
                            break;
                        case 2:
                            System.out.println(t.buscar(apellidos, 2));
                            break;
                    }
                    break;
            }
        } while (opciones >= 1 && opciones <= 7);

    }
}
