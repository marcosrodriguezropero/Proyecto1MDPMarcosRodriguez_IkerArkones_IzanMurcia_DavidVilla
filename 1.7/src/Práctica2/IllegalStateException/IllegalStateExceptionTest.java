package Práctica2.IllegalStateException;

class IllegalStateExceptionTest {
    public static void main(String[] args) {
        IllegalStateException exception = new IllegalStateException(1);
        exception.decrement();
        exception.decrement(); //Salta la excepción puesto que el número se convierte en negativo
    }
}
