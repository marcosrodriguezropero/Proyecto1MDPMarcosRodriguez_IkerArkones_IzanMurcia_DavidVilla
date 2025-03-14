public class TestAuthor {
    public static void main(String[] args) {
        // Crear un objeto Author
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        // Imprimir el objeto (usará el método toString())
        System.out.println(ahTeck);

        // Probar los getters
        System.out.println("Nombre: " + ahTeck.getName());
        System.out.println("Email: " + ahTeck.getEmail());
        System.out.println("Género: " + ahTeck.getGender());

        // Probar el setter de email
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("Nuevo Email: " + ahTeck.getEmail());
    }
}
