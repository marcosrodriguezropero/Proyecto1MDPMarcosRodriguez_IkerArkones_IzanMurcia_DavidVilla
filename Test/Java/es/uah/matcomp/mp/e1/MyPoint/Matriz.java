package es.uah.matcomp.mp.e1.MyPoint;

import static org.junit.jupiter.api.Assertions.*;

class Matriz {
    public static void main(String[] args) {
        int n = 10;
        MyPoint[] points = new MyPoint[n];

        // Inicializar el array con puntos (1,1), (2,2), ..., (10,10)
        for (int i = 0; i < n; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Matriz de distancias
        double[][] distanceMatriz = new double[n][n];

        // Calcular las distancias entre todos los pares de puntos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distanceMatriz[i][j] = points[i].distance(points[j]);
            }
        }

        // Imprimir la matriz de distancias
        System.out.println("Matriz de distancias:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f ", distanceMatriz[i][j]);
            }
            System.out.println();
        }
    }
}