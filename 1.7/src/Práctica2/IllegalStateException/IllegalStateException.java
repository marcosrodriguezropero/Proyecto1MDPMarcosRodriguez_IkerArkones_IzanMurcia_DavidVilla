package Práctica2.IllegalStateException;

class IllegalStateException {
    private int value;
    private boolean decrement = false;

    public IllegalStateException(int value) {
        this.value = value;
    }

    //Se crea una excepción al decrementar el número hasta negativo
    public void decrement() {
        value--;
        if (value < 0) {
            throw new java.lang.IllegalStateException("Negative value");
        }
        decrement = true;
    }
}
