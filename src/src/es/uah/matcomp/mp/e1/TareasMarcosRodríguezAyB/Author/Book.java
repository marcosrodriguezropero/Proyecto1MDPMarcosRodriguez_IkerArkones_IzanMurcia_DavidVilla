package es.uah.matcomp.mp.e1.Author;
//Creamos la clase pública libro
public class Book {
    //Creamos todas las variables privadas
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    //Funciones públicas
    //Creamos la primera función libro con todas excepto una variable "qty"
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //Creamos la segunda función libro con todas las variables
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //Creamos la función pública que devuelve la variable "isbn"
    public String getIsbn() {
        return isbn;
    }

    //Creamos la función pública que devuelve la variable "Name"
    public String getName() {
        return name;
    }

    //Creamos la función pública que devuelve la variable "Author"
    public Author getAuthor() {
        return author;
    }

    //Creamos la función pública que devuelve la variable "Price"
    public double getPrice() {
        return price;
    }

    //Función protegida que devuelve la variable "Price" en otra
    public void setPrice(double prc) {
        this.price = prc;
    }
    //Creamos la función pública que devuelve la variable "Qty"
    public int getQty() {
        return qty;
    }

    //Definimos la variable "Qty"
    public void setQty(int qty) {
        this.qty = qty;
    }

    //Definimos la variable que devulve la variable "author" mediante la función pública "getName"
    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }


}
