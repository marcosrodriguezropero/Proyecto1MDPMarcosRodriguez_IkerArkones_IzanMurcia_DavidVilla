public class TestMain {
    public static void main(String[] args) {
        // Prueba de la clase Author
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(a1);
        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("Nombre: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Género: " + a1.getGender());

        // Prueba de la clase Book
        Author[] authors = {
                new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'),
                new Author("Paul Tan", "paul@somewhere.com", 'm')
        };
        Book b1 = new Book("Java for Dummies", authors, 19.99, 88);
        System.out.println(b1);
        b1.setPrice(25.99);
        b1.setQty(50);
        System.out.println("ISBN: " + b1.getName());
        System.out.println("Autores: " + b1.getAuthorNames());
        System.out.println("Precio: " + b1.getPrice());
        System.out.println("Cantidad: " + b1.getQty());

        // Prueba de la clase Customer
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println("ID: " + c1.getId());
        System.out.println("Nombre: " + c1.getName());
        System.out.println("Descuento: " + c1.getDiscount() + "%");

        // Prueba de la clase Invoice
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(999.9);
        System.out.println("ID de la factura: " + inv1.getId());
        System.out.println("Cliente: " + inv1.getCustomer());
        System.out.println("Monto: " + inv1.getAmount());
        System.out.println("ID del cliente: " + inv1.getCustomerId());
        System.out.println("Nombre del cliente: " + inv1.getCustomerName());
        System.out.println("Descuento del cliente: " + inv1.getCustomerDiscount() + "%");
        System.out.printf("Monto después del descuento: %.2f%n", inv1.getAmountAfterDiscount());
    }
}

