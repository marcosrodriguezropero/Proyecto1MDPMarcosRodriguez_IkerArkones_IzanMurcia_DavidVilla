public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor con balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor sin balance (default = 0)
    public Account(String id, String name) {
        this(id, name, 0);
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Métodos de operaciones
    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Saldo insuficiente para debitar " + amount);
        }
    }

    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Saldo insuficiente para transferir " + amount);
        }
    }
}
