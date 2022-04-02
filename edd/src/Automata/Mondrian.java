package edd.src.Automata;

import java.util.Random;
import edd.src.Estructuras.*;

public class Mondrian extends AC {

    int[][] Maux2 = new int[Imagen.numCells][Imagen.numCells];
    int[][] MauxCopia = new int[Imagen.numCells][Imagen.numCells];
    int[][] CopiaM = new int[Imagen.numCells][Imagen.numCells];

    

    /*
     * Metodo que pinta una matriz inicial de Blanco y le da valores aleatorios a las
     * casillas.
     *
     */
    @Override
    public int[][] getAutomata() {
        int aux1; 
        //Inicializo dos matrices en blanco
        for (int i = 0; i < Maux2.length; i++) {
            for (int j = 0; j < Maux2.length; j++) {
                Maux2[i][j] = 2;
                MauxCopia[i][j] = 2;
            }
        }
        // Modifico cada valor de la matriz Maux de forma aleatoria. Para empezar con un estado random de colores
        for (int i = 0; i < Maux2.length; i++) {
            for (int j = 0; j < Maux2.length; j++) {

                aux1 = (int) (Math.random() * 14); // Random del 0 al 12

                if (aux1 <= 1) {
                    Maux2[i][j] = 3; // Color negro
                } else if (aux1 > 3 && aux1 <= 5) {
                    Maux2[i][j] = 1; // Azul
                } else if (aux1 > 5 && aux1 <= 7) {
                    Maux2[i][j] = 0; // amarillo
                } else if (aux1 > 6 && aux1 <= 8) {
                    Maux2[i][j] = 4; // Rojo
                } else {
                    Maux2[i][j] = 2; // Blanco
                }
            }
        }
        return Maux2;
    }

    /*
     * Metodo para evolucionar el automata.
     *
     */
    @Override
    public void evoluciona() {

        // Se crea una matriz copia para reemplazar los Valores.
        int[][] CopiaM = new int[Imagen.numCells][Imagen.numCells];
        
        // Aqui empieza una evolucion.

        //Creamos una pila y una cola para que te diviertas joven Artista. 
        Pila<Integer> pila = new Pila<Integer>();
        //pila.push(2);
        //pila.pop();
        //pila.push(pila.pop());
        Pila<Integer> cola = new Pila<Integer>();
        
        //La matriz Maux2 Contiene el estado actual de la matriz.
        //La matriz CopiaM es una matriz copia de Maux2 donde debes poner los nuevos valores
        
        // Aqui va tu codigo  


        int amarillo;
        int azul;
        int blanco;
        int rojo;
        int negro;
        for (int i = 0; i < Maux2.length; i++) {
			for (int j = 0; j < Maux2.length; j++) {
                amarillo =0;
                azul=0;
                blanco=0;
                rojo=0;
                negro=0;
                // Revisamos la vecindad de cada casilla.
                for (int k = i - 1; k <= i + 1; k++) {
					for (int l = j - 1; l <= j + 1; l++) {

                        if (k >= 0 && l >= 0 && k < Maux2.length && l < Maux2.length && (k != i || l != j)) {
                            if (Maux2[k][l] == 1) {
                                pila.push(1);
                                azul++;
                            }else if(Maux2[k][l] == 2) {
                                pila.push(2);
                                blanco++;
                            }else if(Maux2[k][l] == 3) {
                                pila.push(3);
                                negro++;
                            }else if(Maux2[k][l] == 4) {
                                pila.push(4);
                                rojo++;
                            }
                            else {
                                pila.push(0);
                                amarillo++;
                            }
                        }

                    }
                }

                // Editar los nuevos valores de la matriz CopiaM. segun los valores de la pila.

    
                if ( pila.pop() == 1  || Maux2[i][j] == 1 ) {
                    CopiaM[i][j] = 2;
                }else if (pila.pop() == 2 || Maux2[i][j] == 2) {
                    CopiaM[i][j] = 3;
                }else if (pila.pop() == 3 || Maux2[i][j] == 3) {
                    CopiaM[i][j] = 4;
                }else if (pila.pop() == 0 || Maux2[i][j] == 0) {
                    CopiaM[i][j] = 1;
                }else if (pila.pop() == 4 || Maux2[i][j] == 4) {
                    CopiaM[i][j] = 0;
                }else if (Maux2[i][j] == 3 || Maux2[i][j] == 0 || Maux2[i][j] == 4 ) {
                    CopiaM[i][j] = 1;
                }
                else {
                    CopiaM[i][j] = Maux2[i][j];
                }
            


            }

        }

        for (int i = 0; i < Maux2.length; i++) { // Fors que arreglan la matriz a regresar en la copia.
            for (int j = 0; j < Maux2.length; j++) {
                Maux2[i][j] = CopiaM[i][j];
            }
        }
        // System.out.println("Termine");//SOP que ayuda a saber cuando acaba una
        // evolucion.
    }

    public int[][] getAutomata2() {
        return Maux2;
    }
}