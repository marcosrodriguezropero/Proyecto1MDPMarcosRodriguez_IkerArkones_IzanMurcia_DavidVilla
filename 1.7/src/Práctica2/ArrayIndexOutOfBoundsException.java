package Práctica2;

class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int [] Array = new int[10];
        System.out.println(Array[10]); //Saca una excepción porque intenta imprimir un valor fuera del rango indicado
    }
}
