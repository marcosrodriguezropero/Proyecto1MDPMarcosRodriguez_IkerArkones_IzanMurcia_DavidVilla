package Práctica2;

class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); //Provoca una excepción al referenciar a un objeto cuya entidad es nula
    }
}
