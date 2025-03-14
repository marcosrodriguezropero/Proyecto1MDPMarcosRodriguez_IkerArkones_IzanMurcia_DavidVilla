public class TestBook {
    public static void main(String[] args) {
        // Crear autores
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Crear un libro con múltiples autores
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        // Probar métodos de acceso
        System.out.println("Nombre del libro: " + javaDummy.getName());
        System.out.println("Autores: " + javaDummy.getAuthorNames());
        System.out.println("Precio: " + javaDummy.getPrice());
        System.out.println("Cantidad en stock: " + javaDummy.getQty());

        // Modificar precio y cantidad
        javaDummy.setPrice(25.99);
        javaDummy.setQty(50);
        System.out.println("Nuevo precio: " + javaDummy.getPrice());
        System.out.println("Nueva cantidad en stock: " + javaDummy.getQty());

        // Probar `toString()`
        System.out.println("Información del libro: " + javaDummy);
    }
}