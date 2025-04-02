package Práctica2;

class IllegalArgumentException {
    public static void validarVel(int velocity) {
        if (velocity < 0) {
            throw new java.lang.IllegalArgumentException("Velocidad invalida");
            //Excepción que se lanza cuando se cumple el argumento de velocidad < 0
        }
    }
    public static void main(String[] args) {
        validarVel(-1);
    }
}
