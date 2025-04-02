import java.util.Scanner;

class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // Intentamos realizar una división
            System.out.print("Introduce un número entero: ");
            int numero1 = teclado.nextInt();
            System.out.print("Introduce otro número entero: ");
            int numero2 = teclado.nextInt();

            float resultado = numero1 / numero2; // Puede lanzar ArithmeticException si numero2 es 0
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos la excepción si ocurre una división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            // Capturamos cualquier otra excepción
            System.out.println("Error: Entrada no válida.");
        } finally {
            // Este bloque siempre se ejecuta
            System.out.println("Operación terminada.");
            teclado.close();
        }
    }
}
