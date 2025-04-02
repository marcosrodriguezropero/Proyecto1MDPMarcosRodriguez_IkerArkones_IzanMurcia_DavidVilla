package Práctica2;

class ClassCastException {
    public static void main(String[] args) {
        Object a = new Object();
        Integer b = (Integer) a; //Provoca una excepción porque se intenta transformar un elemento a otro tipo que son incompatibles
    }
}
