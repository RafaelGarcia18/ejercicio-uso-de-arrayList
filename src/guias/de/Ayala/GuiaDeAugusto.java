package guias.de.Ayala;

import java.util.ArrayList;
import java.util.Scanner;

public class GuiaDeAugusto {

    public static void main(String[] args) {
        int opciones,tamano;
        Scanner entrada = new Scanner(System.in);
        Utilidades u = new Utilidades();
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> apellidos = new ArrayList();

        do {
            System.out.println("Ingrese la opcion deseada\n1.Llenar arraylist\n2.Llenar 10 posiciones mas\n3.Mostrar datos en vector\n4.Ordenar vector\n5.Agregar un dato al vector\n6.Borrar posicion en vector\n7.Buscar dato en el vector");
            opciones = entrada.nextInt();
            switch (opciones) {
                case 1:
                    do{
                    System.out.println("De que tamaño quiere su arraylist");
                    tamano = entrada.nextInt();
                    }while(tamano<=0);
                    for(int i =0;i<tamano;i++){
                        nombres.add(entrada.nextLine());
                        apellidos.add(entrada.nextLine());
                    }
                    break;
                case 2:
//                    vector = o.llenarVector(vector);
                    break;
                case 3:
//                    o.mostrar(vector);
                    break;
                case 4:
//                    vector2 = o.ordenarVector(vector);
                    break;
                case 5:
//                    vector = t.agregar(vector);
                    break;
                case 6:
//                    vector = t.borrar(vector);
                    break;
                case 7:
//                    System.out.println(t.buscar(vector));
                    break;
            }
        } while (opciones >= 1 && opciones <= 6);

    }
}
