package Principall;

import Clases_ControlDatos.Llenado_ManejoDatos;
import javax.swing.JOptionPane;
//Este programa gestiona los datos de los alumnos con sus nombres
//Notas y Clasificacion, es decir si gano o perdio la clase el alumno
//Y muestra el promedio general de la clase

public class Control {

    //Llamamos a la Clase
    static Llenado_ManejoDatos md = new Llenado_ManejoDatos();

    public static void main(String[] args) {
        int iOpcion;//Dato entero para e manejo de opción en el Menú
        String sNotas[][] = new String[10][3];
        //Hacer mientras iOpcion no sea igual a 2
        do {
            //Se Solicita el Ingreso de la opcion del Menú
            iOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Ver Datos\n2.Salir", "MENU PRINCIPAL", JOptionPane.PLAIN_MESSAGE));
            //Se agrega el Switch de acuerdo a la opcion
            switch (iOpcion) {
                case 1:
                    //Se llama al metodo Gestion Notas de la Clase Llenado Manejo Datos
                    md.GestionNotas(sNotas);
                    //Se muestra en pantalla los Datos
                    System.out.print("NOMBRES\t\t" + "NOTAS\t\t" + "CLASIFICACIÓN\n");
                    for (int i = 0; i < sNotas.length; i++) {
                        for (int j = 0; j < sNotas[i].length; j++) {
                            System.out.print(sNotas[i][j] + "\t" + "\t");
                        }
                        System.out.print("\t" + "\n");
                    }
                    //Se muestra el promedio general
                    System.out.print("\nEste es el promedio de Clase:" + md.dPromedio);
                    break;
                case 2:
                    //Muestra el mensaje y termina el programa
                    System.out.print("\n-----------------SALIENDO DEL PROGRAMA-----------------\n");
                    System.exit(0);
                    break;
            }
        } while (iOpcion != 2);

    }

}
