package array.assigment;

public class MyMain {

    public static void main(String[] args) {

        //SE IMPRIME MATRIZ CON 1s EN LA PRIMER FILA, ULTIMA FILA Y LAS DIAGONALES
        System.out.println("Matriz con unos");
        ListMatrix.matrixOne(7);

        System.out.println("\n\n");

        //SE IMPRIME MATRIZ CIRCULAR
        System.out.println("Matriz circular");
        ListMatrix.spiralMatrix(5);
    }
}
