package Clases_ControlDatos;

//Esta clase gestiona y controla los Datos de la Matriz nota generando "automaticamente" los datos
public class Llenado_ManejoDatos {

    //Variables Globales Privadas
    private int iColumna;//Para el manejo de posicion de columna
    //Variables Globales Públicas
    public double dPromedio;//A esta variable el main tendra acceso para mostrarlo

    private void NombreAlumnos(String[][] sNotas) {
        iColumna = 0;//Se le asigna la posicion en columa=0
        //En fila de 0-9 y columna=0, asignamos los nombres de los alumnos
        sNotas[0][iColumna] = "Juan";
        sNotas[1][iColumna] = "Karla";
        sNotas[2][iColumna] = "Pedro";
        sNotas[3][iColumna] = "María";
        sNotas[4][iColumna] = "José";
        sNotas[5][iColumna] = "Lucero";
        sNotas[6][iColumna] = "Mario";
        sNotas[7][iColumna] = "Iris";
        sNotas[8][iColumna] = "Francis";
        sNotas[9][iColumna] = "Yulisa";

    }

    //En este método se hace la Gestión de Notas del Alumno y se indica si Gana o Pierde la clase
    public double GestionNotas(String[][] sNotas) {
        int iSumasTotales = 0;//Variable tipo entero para acumular el valor total de notas, incializada en 0
        int iTotalNotas = 10;//El total de notas que equivale al total de alumnos, para el calculo del promedio
        NombreAlumnos(sNotas);
        for (int i = 0; i < sNotas.length; i++) {
            for (int j = 0; j < sNotas[i].length; j++) {
                //Si la columna(j) equivele a 1, que sería las notas se generea aleatoriamente las notas
                if (j == 1) {
                    //En un rango de 1 a 100 de tipo entero, convertimos el entero a cadena
                    sNotas[i][j] = Integer.toString((int) (Math.random() * (100 - 1) + 1));
                    //Se acumula en la variable iSumasTotales el total
                    iSumasTotales += Integer.parseInt(sNotas[i][j]);

                }
                //Se calcula el promedio
                dPromedio = iSumasTotales / iTotalNotas;
                //Si la columna equivale a dos, donde determinamos si gano o perdio se busca que cumpla con los
                //requerimientos pedidos
                if (j == 2) {
                    //Si la nota es igual o menor a 61, el alumno perdio la clase
                    if (Integer.parseInt(sNotas[i][1]) <= 60) {
                        sNotas[i][j] = "Perdio";
                        //Si el alumno tiene una nota mayo o igual a 61, significa que gano la clase
                    } else if (Integer.parseInt(sNotas[i][1]) > 60) {
                        sNotas[i][j] = "Gano";
                    }
                }

            }
        }

        return dPromedio;
    }
}
