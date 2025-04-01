// Excepción personalizada verificada (checked)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Excepción personalizada no verificada (unchecked)
class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Método que lanza una excepción verificada
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Edad no válida. Debes ser mayor de 18 años.");
        }
        System.out.println("Edad válida: " + age);
    }

    // Método que lanza una excepción no verificada
    public static void checkNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Número negativo detectado: " + number);
        }
        System.out.println("Número válido: " + number);
    }

    public static void main(String[] args) {
        try {
            checkAge(20); // No lanza excepción
            checkAge(15); // Lanza InvalidAgeException
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

        checkNumber(5); // No lanza excepción
        checkNumber(-3); // Lanza NegativeNumberException
    }
}
