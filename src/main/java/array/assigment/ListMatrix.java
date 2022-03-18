package array.assigment;

import java.util.Arrays;

/**
 * Enum que define los barridos que se haran en la matriz circular
 * RightLeft => Barrido de izquierda a derecha
 * TopButtom => Barrido de arriba a abajo
 * LeftRight => Barrido de derecha a izquierda
 * ButtomTop => Barrido de abajo hacia arriba
 */
enum Direcction {
    RightLeft,
    TopButtom,
    LeftRight,
    ButtomTop
}

public class ListMatrix {


    /**
     * Metodo estatico que permite generar una matriz cuadrada de n x n, la cual presenta 1's en sus diagonales, en la primer y
     * ultima fila. El resto de la matriz presenta ceros.
     * @param number Numero de filas y columnas (debido a ser matriz cuadrada)
     */
    public static void matrixOne(int number){
        int[][] matrix = new int[number][number];

        for(int x = 0 ; x < number ; x++){
            for(int y = 0 ; y < number ; y++){
                //Condiciones que el elemento (x,y) sea asignado como 1
                if(x == 0 || x == (number - 1) || x == y || ( x+y == number - 1  ) ){
                    matrix[x][y] = 1;
                    continue;   //Se evita se se ejecute el resto del codigo en el loop
                }
                matrix[x][y] = 0;
            }
        }
        // Se imprime la matriz resultante
        for(int[] m : matrix){
            System.out.println(Arrays.toString(m));
        }
    }

    /**
     * Metodo estatico que permite la impresion de una matriz cuadrada n x n. Esto quiere decir que presenta una numeracion
     * natural, siguiendo el sentido del reloj.
     * @param number Numero de filas y columnas (debido a ser matriz cuadrada)
     */
    public static void spiralMatrix(int number){
        int[][] matrix = new int[number][number];   //Inicializacion de la matriz
        int y_init = 0;                             //Valor de inicio en el eje y
        int x_init = 0;                             //Valor de inicio en el eje x
        int y_end = number ;                        //Valor limite en el eje y, de inicio
        int x_end = number ;                        //Valor limite en el eje x, de inicio
        boolean over = false;                       //Bandera para saber si se ha alcanzado el objetivo
        int count = 1;                              //Contador que llevara a cabo la numeracion natural de la matriz
        Direcction dir = Direcction.LeftRight;      //Direccion de inicio para barrer la matriz

        while(!over){   //Mientras no se alcance el objetivo, se seguira repitiendo la secuencia

            switch (dir){
                //Proceso para barrer la matriz de izquierda a derecha
                case LeftRight:
                    for(int i = x_init ; i < x_end ; i ++ ){
                        matrix[y_init][i] = count;
                        count++;
                    }
                    y_init++;
                    x_end--;
                    dir = Direcction.TopButtom;
                    break;

                //Proceso para barrer la matriz de arriba hacia abajo
                case TopButtom:
                    for(int i = y_init ; i < y_end ; i++){
                        matrix[i][x_end] = count;
                        count++;
                    }
                    dir = Direcction.RightLeft; //Se cambia la direccion de barrido
                    y_end--;
                    break;

                //Proceso para barrer la matriz de derecha a izquierda
                case RightLeft:
                    for(int i = x_end - 1 ; i >= x_init ; i--){
                        matrix[y_end][i] = count;
                        count++;
                    }
                    dir = Direcction.ButtomTop;
                    break;

                //Proceso para barrer la matriz de abajo hacia arriba
                case ButtomTop:
                    for(int i = y_end - 1 ; i >= y_init ; i--){
                        matrix[i][x_init] = count;
                        count++;
                    }
                    x_init++;
                    dir = Direcction.LeftRight;
                    break;
            }
            over = (number*number + 1) <= count;    //Se verifica que el contador aun no llegue al objetivo
        }

        //Se imprime la matriz resultante
        for(int[] m : matrix){
            System.out.println(Arrays.toString(m));
        }
    }
}
