package es.uah.matcomp.mp.e1.AbstractAnimal;

abstract class Animal2 {
    //Variables privadas
    private String name;

    //Funciones públicas
    public Animal2(String name) {
        this.name = name;
    }

    //Método compartido
    public abstract void greets();
}
